package com.revature.dao;

import java.sql.SQLException;

import com.revature.model.Customer;

public interface CustomerDao {
	
	public void insertCustomer() throws SQLException;

	public void getAllCustomer() throws SQLException;

	public boolean getEmployeeById(String id) throws SQLException;

	public void updateCustomer(String id) throws SQLException;

}
