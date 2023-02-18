 package com.revature.poms.model;

public class Receptionist {
	private int ReceptionistId;
	private String ReceptionistName;
	private String email;
	private String phone;
	private String address;
	private String dateOfBirth;
	private String age;
	private String idProof;
	private String preferredLoginId;
	private String password;
	
	
	
	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Receptionist( String ReceptionistName, String email, String phone, String address, String dateOfBirth,
			String age, String password,String idProof, String preferredLoginId ) {
		super();
//		this.ReceptionistId = ReceptionistId;
		this.ReceptionistName = ReceptionistName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		
		
		this.password = password;
		this.idProof = idProof;
		this.preferredLoginId = preferredLoginId;
	}

//
//	public int getReceptionistId() {
//		return ReceptionistId;
//	}
//	public void setReceptionistId(int ReceptionistId) {
//		this.ReceptionistId = ReceptionistId;
//	}
	public String getReceptionistName() {
		return ReceptionistName;
	}
	public void setReceptionistName(String ReceptionistName) {
		this.ReceptionistName = ReceptionistName;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
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
		return "Receptionist [ ReceptionistName=" + ReceptionistName + ", email=" + email + ", phone="
				+ phone + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", idProof="
				+ idProof + ", preferredLoginId=" + preferredLoginId + ", password=" + password + "]";
	}
	/*
	 * private String receptionistName; private String designation; private String
	 * gender; private String receptionistContact; private String address; private
	 * String shiftTiming;
	 * 
	 * public Receptionist() { super(); }
	 * 
	 * public Receptionist(String receptionistName, String designation, String
	 * gender, String receptionistContact, String address, String shiftTiming) {
	 * super(); this.receptionistName = receptionistName; this.designation =
	 * designation; this.gender = gender; this.receptionistContact =
	 * receptionistContact; this.address = address; this.shiftTiming = shiftTiming;
	 * }
	 * 
	 * public String getReceptionistName() { return receptionistName; }
	 * 
	 * public void setReceptionistName(String receptionistName) {
	 * this.receptionistName = receptionistName; }
	 * 
	 * public String getDesignation() { return designation; }
	 * 
	 * public void setDesignation(String designation) { this.designation =
	 * designation; }
	 * 
	 * public String getGender() { return gender; }
	 * 
	 * public void setGender(String gender) { this.gender = gender; }
	 * 
	 * public String getReceptionistContact() { return receptionistContact; }
	 * 
	 * public void setReceptionistContact(String receptionistContact) {
	 * this.receptionistContact = receptionistContact; }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * public String getShiftTiming() { return shiftTiming; }
	 * 
	 * public void setShiftTiming(String shiftTiming) { this.shiftTiming =
	 * shiftTiming; }
	 * 
	 * @Override public String toString() { return "Receptionist [receptionistName="
	 * + receptionistName + ", designation=" + designation + ", gender=" + gender +
	 * ", receptionistContact=" + receptionistContact + ", address=" + address +
	 * ", shiftTiming=" + shiftTiming + "]"; }
	 */

}
