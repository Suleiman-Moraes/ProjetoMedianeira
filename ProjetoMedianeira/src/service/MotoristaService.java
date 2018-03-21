package service;

import java.sql.SQLException;
import java.util.List;
import model.Motorista;
import persistencia.MotoristaDao;

public class MotoristaService implements ICrudService<Motorista>{

    @Override
    public void salvar(Motorista t) throws SQLException {
        if(t.getId() != 0) new MotoristaDao().alterar(t);
        else new MotoristaDao().inserir(t);
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
    
}
