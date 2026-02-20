package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class selectdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner type= new Scanner(System.in);
		  System.out.println("Enter you Fname:");
		  String Fname= type.next();
		  System.out.println("Enter your Lname:");
		  String Lname=  type.next();
		  System.out.println("Enter your Email:");
		  String Email = type.next();
		  System.out.println("Enter your job:");
		  String job= type.next();
		  System.out.println("Enter your Gender:");
		  String Gender= type.next();
		  System.out.println("Enter your salary:");
		  int salary= type.nextInt();
		  System.out.println("Enter your age:");
		  int age= type.nextInt();
		  System.out.println("Enter your city:");
		  String city=type.next();

		  
		  
		 		  
		  Connection connection = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
          
     	 String url="jdbc:mysql://192.168.0.145/test_main";
		 String userName= "root";
		 String password="root";
		 String query="select * from employee_detail";
		 String insertQuery ="insert into employee_detail"
				           + "(Fname,Lname,Email,job,Gender,salary,age,city)" + "values (?,?,?,?,?,?,?,?)";
		 try
		 {
			 //Class.forName("com.mysql.jdbc.Drivers");
			 connection=DriverManager.getConnection(url, userName, password);
				statement=connection.prepareStatement(insertQuery);
				statement.setString(1,Fname);
	            statement.setString(2,Lname);
	            statement.setString(3,Email);
	            statement.setString(4,job);
	            statement.setString(5,Gender);
	            statement.setInt(6,salary);
	            statement.setInt(7,age);
	            statement.setString(8,city);
	            
	            int noofRows = statement.executeUpdate();
	            System.out.println(noofRows);
	          
	            
	            int noOfRows = statement.executeUpdate();
	            System.out.println(noOfRows);
//			resultset=statement.executeQuery(query);
//				while(resultset.next())
//				{
//					System.out.println(resultset.getString("nameoftheparty"));
//				
//				}
//				
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
		//		connection.close();
			//	statement.close();
			//	resultset.close();
				
			}

		

	}

}
