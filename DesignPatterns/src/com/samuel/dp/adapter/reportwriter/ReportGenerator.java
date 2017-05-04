package com.samuel.dp.adapter.reportwriter;

public class ReportGenerator implements ReportWriter{

	ReportAdapter reportAdapter;
	
	public void getReport(String reportType, String reportName) {
		reportAdapter = new ReportAdapter(reportType);
		reportAdapter.getReport(reportType, reportName);
		
		
	}

}
