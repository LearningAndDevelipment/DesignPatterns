package com.samuel.dp.adapter.reportwriter;

public class PdflReport implements AdvancedReportWriter {

	@Override
	public void getPdf(String reportName) {
		System.out.println("Printing pdf report");
	}

	@Override
	public void getExcel(String reportName) {
		System.out.println("Incorrect file type");
		
		
	}

}
