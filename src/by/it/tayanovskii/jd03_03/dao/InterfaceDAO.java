package by.it.tayanovskii.jd03_03.dao;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDAO<Bean> {

    Bean read(long id) throws SQLException;
    boolean create(Bean bean) throws SQLException;
    boolean update(Bean bean) throws SQLException;
    boolean delete(Bean bean) throws SQLException;
    List<Bean> getAll(String whereAndOrder) throws SQLException;

}
