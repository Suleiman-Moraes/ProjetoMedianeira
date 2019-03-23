package interfaces;

import java.sql.SQLException;
import java.util.Iterator;

public interface ICrudService<T> {
    void salvar(T t)throws Exception;
    void deletar(Object ...object) throws SQLException;
    T visualizarUm(Object ...object) throws SQLException;
    Iterator<T> visualizarAll()throws SQLException;
}
