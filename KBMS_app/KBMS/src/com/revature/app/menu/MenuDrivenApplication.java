package com.revature.app.menu;
import java.io.IOException;
//import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;


import com.revature.constant.Constants;
import com.revature.dao.CustomerDao;
import com.revature.dao.impl.CustomerImpl;
//import com.revature.model.User;
//import com.revature.util.DateTimeUtil;
import com.revature.util.MenuCard;

public class MenuDrivenApplication {
	
	
	public static void showMenu() {
		System.out.println(Constants.WELCOME_MESSAGE);
		System.out.println(Constants.SIGN_IN);
		System.out.println(Constants.SIGN_UP);
		System.out.println(Constants.EXIT);
		
		
	
	
	/**
	 * @param args
	 * @throws IOException
	 * @throws SQLException1
	 */
	
		char choice = 'y';
		
		do {
			
			Scanner choiceScan = new Scanner(System.in);
			choice = choiceScan.next().charAt(0);
			switch (choice) {
			case '1':
				signIn();
				break;
			case '2':
				signUp();
				break;
			case '3':
				exit();
				break;
//			case '4':
//				searchSpecificForm();
//				break;
			default:
				System.out.println("\t\t\tWrong option selected!");
			}
			
			
		} while (choice !='n');
	}

	private static void updateForm() {
		Scanner in=new Scanner(System.in);//throws SQLException {
		System.out.println("Enter the id number to update details");
		int id=in.nextInt();
		
		System.out.println("1.Update name");
		System.out.println("2.Update email");
		System.out.println("3.Update Contact number");
		System.out.println("4.Update Address");
		System.out.println("5.Update Date Of Birth");
		System.out.println("6.Exit");
		int c=in.nextInt();
		
		switch (c) {
		case 1:
			System.out.println("Enter the Customer Name:-");
			String name=in.next();
			System.out.println("Name updated successfuly");
			updateForm();
			break;
			
		case 2:
			System.out.println("Enter the Customer Email:-");
			String email=in.next();
			System.out.println("Email updated successfuly");
			break;
		case 3:
			System.out.println("Enter the Customer Contact:-");
			String phoneNo=in.next();
			System.out.println("Contact updated successfuly");
			break;
		case 4:
			System.out.println("Enter the Customer Address:-");
			String address=in.next();
			System.out.println("Address updated successfuly");
			break;
		case 5:
			System.out.println("Enter the Customer Date Of Birth:-");
			String dob=in.next();
			System.out.println("Date Of Birth updated successfuly");
						
			break;
		default:
			System.out.println("Entered value is not correct:-");
			break;
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("\t\t\tYou Selected -Search Guest");
//		System.out.print("\t\t\tPlease Enter Login ID To Search:");
//		String loginId = scan.nextLine();
//		User found = userDao.getUser(loginId.trim());
//		if (Objects.nonNull(found)) {
//			System.out.println("Guest Found!");
//			System.out.println(found);
//		} else {
//			System.out.print("Guest Not Found!");
//		}
	}

	private static void exit() { //throws SQLException {
		
				System.out.println("*************Thank You***********");
				
	}

	private static void signIn() {//throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println(Constants.CUSTOMER_PREFFERED_LOGINID);
		String loginId = scan.nextLine();
		
		System.out.print(Constants.PASSWORD);
		String password = scan.nextLine();
		System.out.println("*********You are successfully logged in********");
		System.out.println("Which operation you want to perform");
		System.out.println("1.Update");
		System.out.println("2.View Details");
		
		int  in = scan.nextInt();
		
		if(in==1) {
			
			updateForm();
		}
		if(in==2) {
			
		}
		
		
		
		
		
//		if (Objects.nonNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter New Password:");
//			String password = scan.nextLine();
//			int result = userDao.update(new User(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
//			if (result > 0)
//				System.out.print("Guest Updated sucessfully!");
//		} else
//			System.out.print("Incorrect Login Id!");
	}

	private static void signUp() { //throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR FOLLOWING DETAILS");
		System.out.println("Enter the ID");
		int id=scan.nextInt();
		System.out.print(Constants.CUSTOMER_NAME);
		String name=scan.next();
		System.out.print(Constants.CUSTOMER_EMAIL);
		String email=scan.next();
		System.out.print(Constants.CUSTOMER_CONTACT);
		String phoneNumber=scan.next();
		System.out.print(Constants.CUSTOMER_ADDRESS);
		String address=scan.next();
		System.out.print(Constants.CUSTOMER_DOB);
		String dateOfBirth=scan.next();
		System.out.print(Constants.CUSTOMER_IDPROOF );
		String idProof=scan.next();
		System.out.print(Constants.CUSTOMER_PREFFERED_LOGINID );
		String loginId=scan.next();
		System.out.print(Constants.PASSWORD );
		String password=scan.next();
		
		System.out.println("\n");
		
		System.out.println("\t*************You have successfully registered*****************");
		System.out.println("To sign in press 1");
		int choice=scan.nextInt();
		if(choice ==1) {
		signIn();
		}
		
		
		
		
//		if (Objects.isNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter You Password:");
//			String password = scan.nextLine();
//			int result = userDao.add(new User(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
//			if (result > 0)
//				System.out.print("Guest added sucessfully!");
//		}
//		else {
//			System.out.print("Login Id Already Taken!");
//		}
	}

}
