package product;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;
import java.lang.ClassNotFoundException;
import java.util.*;
import java.io.*;

public class ProductDaoImp1 implements IProductDao<Product>
{
				
				List<Product> products = new ArrayList<>{};
				private Connection connection;
				public ProductDaoImp1(DBConnection dbConnection) throws ClassNotFoundException, SQLException{
					connection = dbConnection.getConnection();
					connection.setAutoCommit(true);
			}
			String SELECT_ALL_PRODUCT = "SELECT PRODUCTNO, PRODUCTNAME,PROCCCCE,QUANTITY FROM PRODUCT";
						
			
				@Override
				public List<Product> findAll() throws SQLException{
					products.clear();
					Statement selectSTMT = connection.createStatement();
					ResultSet resultSet = selectSTMT.executeQuery(SELECT_ALL_PRODUCT);
					while(resultSet.next()) {
						Product p=new Product(0, SELECT_ALL_PRODUCT, 0, 0);
						p.setProductNo(resultSet.getString("productNo"));
						p.setProductName(resultSet.getString("productName"));
						p.setPrice(resultSet.getString("price"));
						p.setQuantity(resultSet.getString("quantity"));
						products.add(p);
					}
				}
					return products;
			}
				
				@Override
				public Product find(int id) {
				Product ba=null;
				for(Product product:products) {
					if(id == product.getproductNo()) {
						ba = product;
					}
				}
				return null;
				}
				@Override
				public String update(int id, Product newObject) {
					@SuppressWarnings("unused")
					Product
				}
				
