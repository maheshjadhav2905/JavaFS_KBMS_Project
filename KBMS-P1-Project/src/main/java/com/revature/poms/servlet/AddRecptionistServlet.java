package com.revature.poms.servlet;
	
import java.io.IOException;
import java.sql.SQLException;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import com.revature.poms.dao.ReceptionistDaoImpl;
import com.revature.poms.model.Receptionist;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRecptionistServlet
 */
@WebServlet("/AddReceptionist")
public class AddRecptionistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRecptionistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone= request.getParameter("phone");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		String proof = request.getParameter("proof");
		String login = request.getParameter("login");
		Receptionist recept = new Receptionist(name, email, phone, address, dob, age, password, proof,login);
		System.out.println(recept);
		
		try {
			ReceptionistDaoImpl impl = new ReceptionistDaoImpl();
			 impl.addReceptionistDetails(recept);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
