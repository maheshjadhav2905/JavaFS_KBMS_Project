package com.revature.configuration;
import com.revature.configuration.DataBaseConnection;
import java.util.ResourceBundle;

public class App {
	
	
	public static void main(String args[]) {
		usingResourceBundle();
	}
	private static void usingResourceBundle() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("root");
		String dburl = resourceBundle.getString("dbur1"); 
		String driver = resourceBundle.getString("driver");
		String username = resourceBundle.getString("username");
		String password =resourceBundle.getString("password");
		System.out.println("dburl:" + dburl);
		System.out.println("driver: driver"); 
		System.out.println("username:" + username);
		System.out.println("password: " + password);

		}
	

	private static void usingPropertiesClassStatic() {
		Properties prop = new Properties();
		try(InputStream inputstream = Application.class.getClassLoader().getResourceAsStream("chiranjivdb.properties");) {
				prop.load(inputstream);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dburl:"+prop.getProperty("dburl"));
		System.out.println("driver:"+prop.getProperty("driver"));
		System.out.println("username:"+prop.getProperty("db"));
		System.out.println("dburl:"+prop.getProperty("dburl"));

	}    
	
		
		
		
	
	
	

}
