package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;
import java.lang.ClassNotFoundException;
import java.util.*;
import java.io.*;

public class TestProductInventory {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
		{
			DBConnection dbConnection = new DBConnection();
			@SuppressWarnings("resource")
			ProductDaoImpl productrepository = new ProductDaoImpl(dbConnection);
			
			List<Product> productList = productrepository.findAll();
			System.out.println(productList);
			
			String msg = productrepository.add(new Product("p10","brush",100.00,4));
			System.out.println(productList);
			System.out.println("after insertioon");
			productList = productrepository.findAll();
			for(Product p : productList) {
				System.out.println(p);
			}		
	}
}
