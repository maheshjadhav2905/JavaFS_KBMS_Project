package com.revature.poms.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerUpdate
 */
public class CustomerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String name = request.getParameter("name");

		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		
		System.out.println(request.getAttribute("login_id")+"//**********************");
		String login_id = request.getParameter("login_id");
		System.out.println(login_id+"--------------------------------------------------------");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		String url="jdbc:mysql://localhost/KBMS_PROJECT";
    		Connection connection = DriverManager.getConnection(url, "root", "root");
		    
    		LoginPageServlet login = new LoginPageServlet();
    		
		    String sql = "UPDATE Receptionist SET Customer_name = ?, email = ? , phone =?, address=?,date_of_birth=?  WHERE preferred_login_id ='"+login_id+"'";
		    PreparedStatement statement = connection.prepareStatement(sql);
		    statement.setString(1, name);
		    statement.setString(2, email);
		    statement.setString(3, phone);
		    statement.setString(4, address);
		    statement.setString(5, dob);
		    
		    
		    int rowsUpdated = statement.executeUpdate();
		    
		   
		   
		    statement.close();
		    connection.close();
		}catch (SQLException e) {
		    e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			request.setAttribute("loginId", login_id);
			RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
			rd.forward(request, response);
		}
	}
	

}


