package com.revature.poms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.poms.config.DatabaseConnectivity;
import com.revature.poms.model.Receptionist;

public class ReceptionistDaoImpl implements ReceptionistDao {

	private Connection conn = DatabaseConnectivity.getConnection();

	public void addReceptionistDetails(Receptionist recept) throws SQLException {

		PreparedStatement preparedStatement = null;
		String query = "insert into Receptionist(Customer_name,email, Phone ,address, date_of_birth, age,password,identity_proof,preferred_login_id) values(?,?,?,?,?,?,?,?,?)";
		preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, recept.getReceptionistName());
		preparedStatement.setString(2, recept.getEmail());
		preparedStatement.setString(3, recept.getPhone());
		preparedStatement.setString(4, recept.getAddress());
		preparedStatement.setNString(5, recept.getDateOfBirth());
		preparedStatement.setString(6, recept.getAge());
		preparedStatement.setString(7, recept.getPassword());
		preparedStatement.setString(8, recept.getIdProof());
		preparedStatement.setString(9, recept.getPreferredLoginId());
		preparedStatement.executeUpdate();

	}

	public void removeReceptionistDetails(int id) throws SQLException {
		String query = "delete from receptionist where receptionist_id = ?";
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(1, id);
		pStatement.executeUpdate();
	}

	public void getReceptionistDetails() {
		Connection conn = null;
		conn = DatabaseConnectivity.getConnection();
		String query = "select * from receptionist ";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getString(3) + "--"
						+ rs.getString(4) + "--" + rs.getNString(5) + "--" + rs.getString(6) + "--" + rs.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * public boolean getReceptionist_Id(String preferred_login_id) { boolean
	 * isBoolean = false; String query
	 * =" UPDATE Receptionist SET Customer_name = ?, email= ?,Phone=?,address=?,date_of_birth=? WHERE preferred_login_id = 'oajod'"
	 * ; try { PreparedStatement pStatement = conn.prepareStatement(query);
	 * pStatement.setString(1, name); pStatement.setString(1, preferred_login_id);
	 * pStatement.setString(1, preferred_login_id); pStatement.setString(1,
	 * preferred_login_id); pStatement.setString(1, preferred_login_id); ResultSet
	 * resultSet = pStatement.executeQuery(); if (resultSet.next()) { isBoolean =
	 * true; } } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return isBoolean; }
	 */

	
	 
	 

}
