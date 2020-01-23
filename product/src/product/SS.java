package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.lang.ClassNotFoundException;
import java.util.*;
import java.io.*;

public class SS {

	public static void main(String[] args)throws  ClassNotFoundException, SQLException {
	
			int ch=0;
			boolean a=true;
				Scanner s =new Scanner(System.in);
				ArrayList<Productt> p= new ArrayList<>();
				String insert_query = "Insert into productt values(?,'?',?,?)";
				
				String update_query= "update productt set EMP_ID = ? where EMP_NAME =?";
				String delete_query ="delete from productt where EMP_ID= ?";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Oracle02:1521:xe","training1","syntel123");
				
				Statement smt =con.createStatement();
				ResultSet rs= smt.executeQuery("select * from productt");
				while(a)
				{
		System.out.println("1: create");
		System.out.println("2: read");
		System.out.println("3: update");
		System.out.println("4: delete");
		System.out.println("enter your choice");
		ch= s.nextInt();
		
		String sql;
				switch(ch) {
				
				case 1: 
					System.out.println("enter details");
					System.out.println("product number");
					int productNo= s.nextInt();
					System.out.println("productname");
					String productName=s.next();
					System.out.println("price");
					int price=s.nextInt();
					System.out.println("quantity");
					int quantity=s.nextInt();
					sql = "insert into productt values("+productNo+",'"+productName+"',"+price+","+quantity+")";
					smt.execute(sql);
					System.out.println("Done");
//					int noOfRecords =smt.executeUpdate(insert_query);
					break;
					
				case 2:
					p.forEach((n)-> System.out.println(n));
					
					break;
					
					
					
				case 3:
					System.out.println("enter product number");
					int no= s.nextInt();
						
							System.out.println("Choose from below to update\n1.product name\n2.product quantity\n3.product price");
							int option = s.nextInt();
							switch(option)
							{
							case 1:
								System.out.println("new product name");
								String newname = s.next();
								sql = "update productt set productName='"+newname+"' where productNo="+no;
								
								break;
							case 2:								System.out.println("new product quantity");
							int newquant= s.nextInt();
							sql = "update productt set quantity='"+newquant+"' where productNo="+no;
								break;
							case 3:								System.out.println("new product price");
							int pp= s.nextInt();
							sql = "update productt set price='"+pp+"' where productNo="+no;
							break;
							}
					
					
					
					break;
				case 4:
					System.out.println("Enter pno to delete record");
					int delete = s.nextInt();
					sql = "delete from productt where productNo="+delete;
					smt.execute(sql);
					System.out.println("poindi");
					rs.close();
					smt.close();
					con.close();
					
					
				}
				}
			}
	
}