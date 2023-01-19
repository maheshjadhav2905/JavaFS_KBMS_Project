package com.revature.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static Connection con=null;
	static {
	String url="jdbc:mysql://localhost/KBMS_PROJECT";
	String user="root";
	String pass="root";

	try
	{
		 con = DriverManager.getConnection(url,user,pass);
		 
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	}	
public static Connection getConnection()
{
	return con;
}


	
	
}
