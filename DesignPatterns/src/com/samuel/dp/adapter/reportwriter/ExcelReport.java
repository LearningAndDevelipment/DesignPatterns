package com.samuel.dp.adapter.reportwriter;

public class ExcelReport implements AdvancedReportWriter {

	@Override
	public void getPdf(String reportName) {
		System.out.println("Incorrect file type");
		
	}

	@Override
	public void getExcel(String reportName) {
		System.out.println("Printing Excel report");
		
		
	}

}
