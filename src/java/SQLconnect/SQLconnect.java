package java.SQLconnect;

import java.sql.*;

public class SQLconnect 
{
	  @SuppressWarnings("unused")
	  public static void main(String[] args) throws InstantiationException, IllegalAccessException 
	  {
		  Connection connection = null;
		  try
		  {
			  String driverName = "jdbc";
			 
			  Class.forName(driverName).newInstance();
		 
			  String serverName = "localhost";
			  String serverPort = "3306";
			  String database = serverName + ":" + serverPort;
			  String url = "Mysqlf://" + database;
			  String username = "root";
			  String password = "Password";
			  
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