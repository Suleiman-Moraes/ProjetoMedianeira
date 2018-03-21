package service;

import java.sql.SQLException;
import java.util.List;

public interface ICrudService<T> {
    void salvar(T t)throws SQLException;
    void deletar(Object ...object) throws SQLException;
    T visualizarUm(Object ...object) throws SQLException;
    List<T> visualizarAll()throws SQLException;
}
