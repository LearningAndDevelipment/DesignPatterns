package com.samuel.dp.adapter.reportwriter;

public class ReportAdapter implements ReportWriter {

	AdvancedReportWriter advancedReportWriter;

	public void getReport(String reportType, String reportName) {
		if(reportType.equals("pdf")){
			advancedReportWriter.getPdf(reportName);
		}else if(reportType.equals("xls")){
			advancedReportWriter.getExcel(reportName);
		}
		
	}
	
	public ReportAdapter(String reportType){
		   
	      if(reportType.equalsIgnoreCase("pdf") ){
	    	  advancedReportWriter = new PdflReport();			
	         
	      }else if (reportType.equalsIgnoreCase("xls")){
	    	  advancedReportWriter = new ExcelReport();
	      }	
	   }

}
