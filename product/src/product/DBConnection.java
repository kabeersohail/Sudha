package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args)
	{
		Connection con=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@oracle02:1521:xe","training1","syntel123");
	}
	catch (Exception e) {
	System.out.println(e);
	}
	
	}
}
