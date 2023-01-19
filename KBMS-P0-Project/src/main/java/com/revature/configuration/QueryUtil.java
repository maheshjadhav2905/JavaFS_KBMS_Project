package com.revature.configuration;

public class QueryUtil {
	public static final String INSERT_QUERY="INSERT INTO `gd`.`authentication` (`LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED`) VALUES (?,?,?) ";
	public static final String query = "INSERT INTO  `KBMS_PROJECT`.`Customer`(Customer_name, email, phone, address, date_of_birth, age, password, identity_proof, preferred_login_id ) VALUES (?,?,?,?,?,?,?,?,?)";
    public static String insertCustomer() {
    	return "INSERT INTO  `KBMS_PROJECT`.`Customer`(Customer_name, email, phone, address, date_of_birth, age, password, identity_proof, preferred_login_id ) VALUES (?,?,?,?,?,?,?,?,?)";
    	}
    public static String selectAllCustomer() {
        return 	"SELECT * FROM Customer";
    }
    public static String selectEmpById(String id) {
    	return "SELECT * FROM `KBMS_PROJECT`.`Customer` WHERE preferred_login_id ='"+id+"'";
    }
    public static final String SELECT_QUERY = "SELECT * FROM Customer WHERE preferred_login_id = ? ";
    public static String updateName(String id,String newName) {
    	return "UPDATE Customer SET Customer_name ='"+newName+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String updateEmail(String id,String newEmail) {
    	return "UPDATE Customer SET email ='"+newEmail+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String updateContact(String id,String newContact) {
    	return "UPDATE Customer SET phone ='"+newContact+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String updateAddress(String id,String newAddress) {
    	return "UPDATE Customer SET address ='"+newAddress+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String updateDOB(String id,String newDOB) {
    	return "UPDATE Customer SET date_of_birth ='"+newDOB+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String updateAge(String id,String newAge) {
    	return "UPDATE Customer SET age ='"+newAge+"' WHERE preferred_login_id='"+id+"'";
    }
    public static String chechCustomer() {
    	return "SELECT * FROM Customer WHERE preferred_login_id = ? + AND password = ? ";
    }
}
//Exception in thread "main" java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
