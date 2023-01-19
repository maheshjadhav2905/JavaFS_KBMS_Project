package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.app.menu.MenuDrivenApplication;
import com.revature.configuration.DatabaseConnection;
import com.revature.configuration.QueryUtil;
import com.revature.constant.Constants;
import com.revature.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	public static final Logger logger = Logger.getLogger(CustomerDaoImpl .class);
	DatabaseConnection databaseConnection =new DatabaseConnection();

	@Override
	public void insertCustomer() throws SQLException {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
		
		
//		logger.info(Constants.LOGIN_ID);
//		int id = scan.nextInt();
//		customer.setCustomerId(id);
        Customer customer = new Customer();
		logger.info(Constants.CUSTOMER_NAME);
		String name = scan.next();
		customer.setCustomerName(name);
		
		logger.info(Constants.CUSTOMER_EMAIL);
		String email = scan.next();
		customer.setEmail(email);
		
		logger.info(Constants.CUSTOMER_CONTACT);
		String contact = scan.next();
		customer.setPhone(contact);
		
		
		logger.info(Constants.CUSTOMER_ADDRESS);
		String address = scan.next();
		customer.setAddress(address);
		
		logger.info(Constants.CUSTOMER_DOB);
		String dob =scan.next();
		customer.setDateOfBirth(dob);
		
		logger.info(Constants.AGE);
		int age=scan.nextInt();
		customer.setAge(age);
		
		logger.info(Constants.PASSWORD);
		String pass = scan.next();
		customer.setPassword(pass);
		
		logger.info(Constants.CUSTOMER_IDPROOF);
		String idProof = scan.next();
		customer.setIdProof(idProof);
		
		logger.info(Constants.CUSTOMER_PREFFERED_LOGINID);
		String prefferedLogin = scan.next();
		customer.setPreferredLoginId(prefferedLogin);
		
		try(Connection connection =databaseConnection.getConnection(); 
				)			
				{
					PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.insertCustomer());
			
//			preparedStatement.setInt(1, id);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, dob);
			preparedStatement.setInt(6, age);
			preparedStatement.setString(7, pass);
			preparedStatement.setString(8, idProof);
			preparedStatement.setString(9, prefferedLogin);
			
			int rows =preparedStatement.executeUpdate();
			
			if(rows>0) {
				logger.info("Customer added successfully");
			}
			else {
				logger.info("Failed");
			}
			preparedStatement.close();
			connection.close();
			
			MenuDrivenApplication.showMenu();
			
			
		}
		
		
		
	}
	

	@Override
	public void getAllCustomer() throws SQLException {
		try(Connection connection = databaseConnection.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllCustomer());){
			    
			while(resultSet.next()) {
				
				printCustomer(resultSet);
			}
		}
		// TODO Auto-generated method stub
		
	}
	public void printCustomer(ResultSet set) {
		try {
//			logger.info("Customer Id :"+set.getInt(1));
			logger.info("Customer Name :"+set.getString(1));
			logger.info("Customer Email :"+set.getString(2));
			logger.info("Customer Contact Number:"+set.getString(3));
			logger.info("Customer Address :"+set.getString(4));
			logger.info("Customer Date Of Birth :"+set.getString(5));
			logger.info("Customer Age:"+set.getString(6));
			logger.info("Customer  Id proof :"+set.getString(8));
			logger.info("Customer  Preffered LogiId :"+set.getString(9));
			
			logger.info("------------------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean getEmployeeById(String id) throws SQLException {
		// TODO Auto-generated method stub
		boolean isBoolean = false;
		try(Connection connection = databaseConnection.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectEmpById( id))){
		if(resultSet.next()) {
			isBoolean=true;
			
			printCustomer(resultSet);
		}	else {
			logger.info("Record no found");
		}
		}
		return isBoolean;
	}

	@Override
	public void updateCustomer(String id) throws SQLException {
		
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String name = id;
		try(Connection connection =databaseConnection.getConnection();){
			
			logger.info("Press 1: Update Name");
			logger.info("Press 2: Update Email");
			logger.info("Press 3: Update Contact");
			logger.info("Press 4: Update Address");
			logger.info("Press 5: Update Date of Birth");
			logger.info("Press 6: Update Age");
			
			logger.info("Press 7 to exit");
			
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				logger.info("Enter new name");
				String newName = input.next();
				PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.updateName(name,newName));
				int rows =preparedStatement.executeUpdate();
				if(rows>0) {
					logger.info("Name updated successfully");
					logger.info("Press 1 to go back");
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
				}
				else {
					logger.info("Failed");
				}
			case 2:
				logger.info("Enter new email");
				String email = input.next();
				PreparedStatement preparedStatement2 =connection.prepareStatement(QueryUtil.updateEmail(name,email));
				int rows2 =preparedStatement2.executeUpdate();
				if(rows2>0) {
					logger.info("Email updated successfully");
					logger.info("Press 1 to go back");
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
					
				}
				else {
					logger.info("Failed");
				}
			case 3:
				logger.info("Enter new contact");
				String contact = input.next();
				PreparedStatement preparedStatement3 =connection.prepareStatement(QueryUtil.updateContact(name,contact));
				int rows3 =preparedStatement3.executeUpdate();
				if(rows3>0) {
					logger.info("Contact updated successfully");
					logger.info("Press 1 to go back");
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
					
				}
				else {
					logger.info("Failed");
				}
			case 4:
				logger.info("Enter new address");
				String address = input.next();
				PreparedStatement preparedStatement4 =connection.prepareStatement(QueryUtil.updateAddress(name,address));
				int rows4=preparedStatement4.executeUpdate();
				if(rows4>0) {
					logger.info("Contact updated successfully");
					logger.info("Press 1 to go back");
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
					
				}
				else {
					logger.info("Failed");
				}
			case 5:
				logger.info("Enter new date of birth");
				String DOB = input.next();
				PreparedStatement preparedStatement5 =connection.prepareStatement(QueryUtil.updateDOB(name,DOB));
				int rows5=preparedStatement5.executeUpdate();
				if(rows5>0) {
					logger.info("Date of birth  updated successfully");
					logger.info("Press 1 to go back");
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
					
				}
				else {
					logger.info("Failed");
				}
			case 6:
				logger.info("Enter new age");
				String age = input.next();
				PreparedStatement preparedStatement6 =connection.prepareStatement(QueryUtil.updateAge(name,age));
				int rows6=preparedStatement6.executeUpdate();
				if(rows6>0) {
					logger.info("Age updated successfully");
					logger.info("Press 1 to go back");
					
					int n1=input.nextInt();
					if(n1==1) {
					updateCustomer(name);
					}
					
				}
				else {
					logger.info("Failed");
				}
			case 7:
				MenuDrivenApplication.showMenu();
				break;
			default :
				logger.info("Wrong option selected");
				updateCustomer(name);
				
			    
			
			}
		
		}}}


