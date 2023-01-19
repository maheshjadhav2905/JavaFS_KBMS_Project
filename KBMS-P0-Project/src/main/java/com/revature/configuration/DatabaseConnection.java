package com.revature.configuration;



import java.sql.Connection;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
//	private static Connection con = null;
//    static
//    {
//        String url = "jdbc:mysql://localhost/KBMS_PROJECT";
//        String user = "root";
//        String pass = "root";
//        try {
//        //  Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url, user, pass);
//        }
//        catch (/*ClassNotFoundException |*/ SQLException e) {
//            logger.info(e);
//        }
//    }
//    public static Connection getConnection()
//    {
//        return con;
//    }
	private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	private static final  String DATABASE_URL="jdbc:mysql://localhost:3306/KBMS_PROJECT";
	private static final  String USERNAME = "root";
	private static final  String PASSWORD = "root";
	
	public DatabaseConnection() {
		try {
			
			Class.forName(DRIVER_PATH);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Something went wrong ."+e);
		}
	}
    public Connection  getConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	}
}
