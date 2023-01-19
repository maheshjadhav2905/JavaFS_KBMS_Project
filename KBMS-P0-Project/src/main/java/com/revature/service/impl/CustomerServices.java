package com.revature.service.impl;

//import com.mysql.cj.xdevapi.Statement;
import com.revature.app.menu.MenuDrivenApplication;
import com.revature.configuration.DatabaseConnection;
import com.revature.configuration.QueryUtil;
import com.revature.constant.Constants;
import com.revature.dao.CustomerDao;
import com.revature.dao.CustomerDaoImpl;
import com.revature.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import java.sql.Statement;

public class CustomerServices {
	public static final Logger logger = Logger.getLogger( CustomerServices.class);

	DatabaseConnection databaseConnection = new DatabaseConnection();
	Customer customer = new Customer();

	public void login() throws SQLException {

		try (Connection connection = databaseConnection.getConnection();) {
			Statement statement = connection.createStatement();
			CustomerDao customerService = new CustomerDaoImpl();
			// Get input from user
			Scanner sc = new Scanner(System.in);
			System.out.print("Username: ");
			String username = sc.nextLine();
			System.out.print("Password: ");
			String password = sc.nextLine();

			// Execute a query

			logger.info("Checking credentials...");

			String sql;
			sql = "SELECT * FROM customer WHERE preferred_login_id = '" + username + "' AND password = '" + password
					+ "'";
			ResultSet rs = statement.executeQuery(sql);

			// Extract data from result set

			if (rs.next()) {
				// Retrieve by column name
				String customerName = rs.getString("preferred_login_id");
				String customerPassword = rs.getString("password");

				// Display values
				logger.info("\n");
				logger.info("-------------Welcome, " + customerName + "!----------------");
				MenuDrivenApplication.showMenu();
			} else {
				Scanner scan = new Scanner(System.in);
				logger.info("Invalid username or password.");
				logger.info("You r not registered user");
				logger.info("Press 1 to registered");
				int n = scan.nextInt();
				if (n == 1) {
					customerService.insertCustomer();
				}
			}
			// Clean-up environment
			rs.close();
			statement.close();
		}
	}

}
