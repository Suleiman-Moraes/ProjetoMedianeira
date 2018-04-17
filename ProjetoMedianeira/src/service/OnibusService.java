package service;

import java.sql.SQLException;
import java.util.List;
import model.Onibus;
import persistencia.OnibusDao;

public class OnibusService implements ICrudService<Onibus>{

    @Override
    public void salvar(Onibus t) throws Exception {
        if(new OnibusDao().existe(t.getNumero())) new OnibusDao().alterar(t);
        else new OnibusDao().inserir(t);
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new OnibusDao().deletar(object);
    }

    @Override
    public Onibus visualizarUm(Object... object) throws SQLException {
        return new OnibusDao().visualizarUm(object);
    }

    @Override
    public List<Onibus> visualizarAll() throws SQLException {
        return new OnibusDao().visualizarAll();
    }
    
    public boolean existe(String numero) throws SQLException{
        return new OnibusDao().existe(numero);
    }
}
