package java.SQLconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLconnect 
{
	  @SuppressWarnings("unused")
	public static void main(String[] args) 
	  {
		  Connection connection = null;
		  try
		  {
			  String driverName = "com.jnetdirect.jsql.JSQLDriver";
			 
			  Class.forName(driverName);
		 
			  String serverName = "localhost";
			 
			  String serverPort = "1433";
			 
			  String database = serverName + ":" + serverPort;
			 
			  String url = "jdbc:JSQLConnect://" + database;
			 
			  String username = "username";
			 
			  String password = "password";
			 
			  connection = DriverManager.getConnection(url, username, password);
			 
			  System.out.println("Successfully Connected to the database!");
			 
			  }
			  catch (ClassNotFoundException e) 
			  {	 
				  System.out.println("Could not find the database driver " + e.getMessage());
			  } 
			  catch (SQLException e) 
			  {
			  System.out.println("Could not connect to the database " + e.getMessage());
			  }
		 }
}