package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import model.Passagem;
import persistencia.PassagemDao;

public class PassagemService implements ICrudService<Passagem>{

    @Override
    public void salvar(Passagem t) throws Exception {
        new PassagemDao().inserir(t);
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        if(object.length != 2) throw new SQLException("Atributos Insulficientes.");
        new PassagemDao().deletar(object);
    }

    @Override
    public Passagem visualizarUm(Object... object) throws SQLException {
        if(object.length != 2) throw new SQLException("Atributos Insulficientes.");
        return new PassagemDao().visualizarUm(object);
    }

    @Override
    public Iterator<Passagem> visualizarAll() throws SQLException {
        return new PassagemDao().visualizarAll().iterator();
    }
    
}
