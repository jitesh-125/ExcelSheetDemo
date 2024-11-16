package com.example.ExcelSheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExcelSheet.services.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		String headerKey ="ContentDisposition";
		//String headerValue= "attachment;filename=courses.xls";
		String headerValue= "attachment;filename=file_example_XLS_10.xls";
		response.setHeader(headerKey, headerValue);
		reportService.generateExcel(response);
		
	}

}
