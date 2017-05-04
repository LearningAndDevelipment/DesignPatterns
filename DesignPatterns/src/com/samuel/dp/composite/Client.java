package com.samuel.dp.composite;

public class Client {

	public static void main(String[] args){
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem masterMenuItem = new MenuItem("Master","/master");
		mainMenu.add(masterMenuItem);
		Menu reportMenu = new Menu("Report","/report");
		mainMenu.add(reportMenu);
		MenuItem customerReportMenu = new MenuItem("Customer Report","/customerReport");
		reportMenu.add(customerReportMenu);
		System.out.println(mainMenu.toString());
	}
}
