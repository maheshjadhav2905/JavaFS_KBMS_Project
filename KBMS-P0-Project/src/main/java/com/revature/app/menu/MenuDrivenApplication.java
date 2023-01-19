package com.revature.app.menu;

import java.io.IOException;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.constant.Constants;
import com.revature.dao.CustomerDao;
import com.revature.dao.CustomerDaoImpl;
//import com.revature.dao.impl.CustomerImpl;
import com.revature.model.Customer;
import com.revature.service.impl.CustomerServices;

public class MenuDrivenApplication {
	public static final Logger logger = Logger.getLogger(MenuDrivenApplication.class);
	
	

	public static CustomerDao customerService = new CustomerDaoImpl();
	    public static void mainMenu() throws SQLException {
	    	Scanner input = new Scanner(System.in);
	    	logger.info(Constants.WELCOME_MESSAGE);
	    	logger.info("-------------------------------------");
	    	logger.info("-------------------------------------");
	    	logger.info("\t1.Sign IN");
	    	logger.info("\t2.Register");
	    	logger.info("-------------------------------------");
	    	logger.info("-------------------------------------");
	    	int n = input.nextInt();
	    	if(n==1) {
	    		CustomerServices c1 = new CustomerServices();
	    		c1.login();
	    	}
	    	if(n==2) {
	    		customerService.insertCustomer();
	    	}
	    	
	    	
	    }
		public static  void showMenu() throws SQLException {
		Scanner input = new Scanner(System.in);
		logger.info(Constants.WELCOME_MESSAGE);
		logger.info("----------------------------------------");
		logger.info(Constants.INSERT_CUSTOMER);
		logger.info(Constants.SELECT_CUSTOMER_ALL);
		logger.info(Constants.SELECT_CUSTOMER);
		logger.info(Constants.UPDATE_CUSTOMER);
		logger.info("----------------------------------------");
		
		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1: 
			
			customerService.insertCustomer();
			break;
		case 2:
			customerService.getAllCustomer();
			break;
		case 3:
			logger.info("Enter the login id");
			String id=input.next();
			customerService.getEmployeeById(id); 
			break;
		case 4:
			logger.info("Enter the login id");
			String updateId=input.next();
			boolean isFound = customerService.getEmployeeById(updateId);
			if(isFound) {
				customerService.updateCustomer(updateId);
			}
			break;
			
		default:
			showMenu();
			
		}
	
		
		
	}
	
	

}
