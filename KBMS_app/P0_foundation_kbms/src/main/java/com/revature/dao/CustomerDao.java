package com.revature.dao;

import com.revature.model.Customer;

public interface CustomerDao {
	
	public Customer getUser(String username, String password);

}
