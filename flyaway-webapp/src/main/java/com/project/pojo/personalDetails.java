package com.project.pojo;

public class personalDetails {
	@Override
	public String toString() {
		return "personalDetails [name=" + name + ", email=" + email + ", phone=" + phone + ", aadhar=" + aadhar
				+ ", gender=" + gender + "]";
	}
	public personalDetails(String name, String email, String phone, String aadhar, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.aadhar = aadhar;
		this.gender = gender;
	}
	public personalDetails() {
		super();
	}
	private String name;
	private String email;
	private String phone;
	private String aadhar;
	private String gender;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the aadhar
	 */
	public String getAadhar() {
		return aadhar;
	}
	/**
	 * @param aadhar the aadhar to set
	 */
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
