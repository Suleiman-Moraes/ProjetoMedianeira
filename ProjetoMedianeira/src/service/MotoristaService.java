package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.List;
import model.Motorista;
import persistencia.MotoristaDao;

public class MotoristaService implements ICrudService<Motorista>{

    @Override
    public void salvar(Motorista t) throws Exception {
        if(t.getId() != 0){
            validaCnhParaAlteracao(t);
            new MotoristaDao().alterar(t);
        }
        else{
            if(buscarMotoristaComMesmaCNH(t.getCnh())) throw new Exception("CNH Já Existente.");
            new MotoristaDao().inserir(t);
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new MotoristaDao().deletar(object);
    }

    @Override
    public Motorista visualizarUm(Object... object) throws SQLException {
        return new MotoristaDao().visualizarUm(object);
    }

    @Override
    public List<Motorista> visualizarAll() throws SQLException {
        return new MotoristaDao().visualizarAll();
    }
    
    public boolean buscarMotoristaComMesmaCNH(String cnh) throws SQLException{
        return new MotoristaDao().buscarMotoristaComMesmaCNH(cnh) > 0;
    }
    
    public void validaCnhParaAlteracao(Motorista t) throws Exception{
        String cnh = new MotoristaDao().buscarCnhPassandoId(t.getId());
        if(!cnh.equals(t.getCnh()) && buscarMotoristaComMesmaCNH(cnh))
            throw new Exception("CNH Já Existente.");
    }
    
    public List<Motorista> buscarMotoristaPassandoCidade(String local) throws SQLException {
        return new MotoristaDao().buscarMotoristaPassandoCidade(local);
    }
}
