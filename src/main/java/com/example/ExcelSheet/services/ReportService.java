package com.example.ExcelSheet.services;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExcelSheet.model.Course;
import com.example.ExcelSheet.repo.CouserRepo;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportService {
	
	@Autowired
	private CouserRepo couseRepo;
	
	
	public void generateExcel(HttpServletResponse response) throws IOException {
		List<Course> courses= couseRepo.findAll();
		
		HSSFWorkbook workbook =new HSSFWorkbook();
		HSSFSheet sheet	=workbook.createSheet("Couser Info");
		HSSFRow row=sheet.createRow(0);
		
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Price");
		
		int dataRowIndex =1;
		for(Course course : courses) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(course.getCid());
			dataRow.createCell(1).setCellValue(course.getCname());
			dataRow.createCell(2).setCellValue(course.getPrice());
			dataRowIndex ++;
				
		}
		 ServletOutputStream ops=response.getOutputStream();
		 workbook.write(ops);
		 workbook.close();
		 ops.close();
		
		
		
	}

}
