package com.samuel.dp.adapter;

public class UserAdapter implements User {
	
	private LdapUser ldapUser;
	
	UserAdapter(LdapUser ldapUser) {
		this.ldapUser = ldapUser;
	}

	
	public String getId() {
		// TODO Auto-generated method stub
		return ldapUser.getCn();
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return ldapUser.getFirstName()+" "+ldapUser.getSurname();
	}

	
	public String getEmail() {
		// TODO Auto-generated method stub
		return ldapUser.getEmail();
	}
	
	

}
