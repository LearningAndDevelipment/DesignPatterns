package com.samuel.dp.adapter;

public class client {

	public static void main(String[] args) {
		User user1 = new UserData("1", "Shwetha Reddy", "shwetha@gmail.com");
		User user2 = new UserAdapter(new LdapUser("2" , "Singhal" , "Test" , "test@gmail.com" ));

	}

}
