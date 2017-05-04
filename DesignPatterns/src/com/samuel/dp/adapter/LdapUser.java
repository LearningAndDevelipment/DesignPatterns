package com.samuel.dp.adapter;

public class LdapUser {
	private String cn;
	private String surname;
	private String firstName;
	private String email;
	
	LdapUser(String cn, String surname, String firstName, String email){
		this.cn=cn;
		this.surname=surname;
		this.firstName = firstName;
		this.email=email;
		
	}
	
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
