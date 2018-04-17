package service;

import java.sql.SQLException;
import java.util.List;
import model.Modelo;
import persistencia.ModeloDao;

public class ModeloService implements ICrudService<Modelo>{

    @Override
    public void salvar(Modelo t) throws Exception {
        if(t.getId() != 0) new ModeloDao().alterar(t);
        else new ModeloDao().inserir(t);
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new ModeloDao().deletar(object);
    }

    @Override
    public Modelo visualizarUm(Object... object) throws SQLException {
        return new ModeloDao().visualizarUm(object);
    }

    @Override
    public List<Modelo> visualizarAll() throws SQLException {
        return new ModeloDao().visualizarAll();
    }
}
