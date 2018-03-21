package persistencia;

import java.sql.SQLException;
import java.util.List;

public interface ICrudDao<T> {
    void inserir(T t)throws SQLException;
    void deletar(Object ...object) throws SQLException;
    void alterar(T t) throws SQLException;
    T visualizarUm(Object ...object) throws SQLException;
    List<T> visualizarAll()throws SQLException;
}
