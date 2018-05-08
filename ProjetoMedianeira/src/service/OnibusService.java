package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
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
    public Iterator<Onibus> visualizarAll() throws SQLException {
        return new OnibusDao().visualizarAll().iterator();
    }
    
    public boolean existe(String numero) throws SQLException{
        return new OnibusDao().existe(numero);
    }
}
