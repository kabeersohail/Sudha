package product;

import java.awt.List;
import java.sql.SQLException;

public interface IProductDao<T> {
	String add(T object);
	
	List findAll() throws SQLException;
	
	T find(int id);
	String update(int id,T newObject);
	 String delete(int id);
}