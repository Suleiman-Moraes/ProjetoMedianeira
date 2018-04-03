package service;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Motorista;
import model.Onibus;
import model.Viagem;
import persistencia.ViagemDao;

public class ViagemService implements ICrudService<Viagem>{

    @Override
    public void salvar(Viagem t) throws SQLException {
        if(!this.retornarDisponibilidade(t.getMotorista(), t.getDataSaida(), t.getDe())) 
            throw new SQLException("Motorista Indisponivel.");
        if(!this.retornarDisponibilidade(t.getOnibus(), t.getDataSaida(), t.getDe())) 
            throw new SQLException("Ônibus Indisponivel.");
        if(t.getId() > 0) new ViagemDao().alterar(t);
        else new ViagemDao().inserir(t);
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new ViagemDao().deletar(object);
    }

    @Override
    public Viagem visualizarUm(Object... object) throws SQLException {
        return new ViagemDao().visualizarUm(object);
    }

    @Override
    public List<Viagem> visualizarAll() throws SQLException {
        return new ViagemDao().visualizarAll();
    }
    
    public boolean retornarDisponibilidade(Motorista motorista, Date data, String de) throws SQLException{
        if(de != motorista.getLocalizacao()) return false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, -1);
        String consulta = " WHERE motorista ="+motorista.getId()+" AND data_saida BETWEEN '"
                +new java.sql.Date(calendar.getTime().getTime());
        calendar.setTime(data);
        calendar.add(Calendar.DATE, 1);
        consulta += "' AND '"+new java.sql.Date(calendar.getTime().getTime())+"'";
        int x = new ViagemDao().consultaPassandoParametrosCOUNT(consulta);
        
        if(x > 0) return false;
        else return true;
    }
    
    public boolean retornarDisponibilidade(Onibus onibus, Date data, String de) throws SQLException{
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, -1);
        String consulta = " WHERE onibus ='"+onibus.getNumero()+ "' AND data_saida ='"
                +new java.sql.Date(data.getTime())+"';";
        if(new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) return false;
        
        consulta = "";
            consulta = " WHERE onibus ='"+onibus.getNumero()+ "' AND data_saida ='"
                +new java.sql.Date(calendar.getTime().getTime())+"' AND " + 
                "de ='"+de+"';";
        if(new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) return false;
        
        calendar.setTime(data);
        calendar.add(Calendar.DATE, 1);
        consulta = "";
            consulta = " WHERE onibus ='"+onibus.getNumero()+ "' AND data_saida ='"
                +new java.sql.Date(calendar.getTime().getTime())+"' AND " + 
                "de ='"+de+"';";
        if(new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) return false;
        
        return true;
    }
}
