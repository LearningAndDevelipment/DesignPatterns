package com.samuel.dp.adapter.reportwriter;

public class Client {

	public static void main(String[] args) {
		ReportGenerator reportGenerator = new ReportGenerator();
		reportGenerator.getReport("pdf", "Customer");

	}

}
