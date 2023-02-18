package com.revature.poms.model;

public class Customer {
	
//	private int customerId;
	private String customerName;
	private String email;
	private String phone;
	private String address;
	private String dateOfBirth;
	private int age;
	private String idProof;
	private String preferredLoginId;
	private String password;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer( String customerName, String email, String phone, String address, String dateOfBirth,
			int age, String idProof, String preferredLoginId, String password) {
		super();
//		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.idProof = idProof;
		this.preferredLoginId = preferredLoginId;
		this.password = password;
	}

//
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String contact) {
		this.phone = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getPreferredLoginId() {
		return preferredLoginId;
	}
	public void setPreferredLoginId(String preferredLoginId) {
		this.preferredLoginId = preferredLoginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [ customerName=" + customerName + ", email=" + email + ", phone="
				+ phone + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", idProof="
				+ idProof + ", preferredLoginId=" + preferredLoginId + ", password=" + password + "]";
	}
	
	
	

	

}
