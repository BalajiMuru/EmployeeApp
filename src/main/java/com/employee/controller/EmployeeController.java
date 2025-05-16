package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.ApiResponse;
import com.employee.dto.EmployeeSummary;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employeeSummary")
	public ResponseEntity<ApiResponse<List<EmployeeSummary>>> getEmployeeSummary(){
		try {
		List<EmployeeSummary> summary = employeeService.getEmployeeSummary();
		ApiResponse<List<EmployeeSummary>> respone = new ApiResponse(true,"Data is available",summary);
		return ResponseEntity.ok(respone);
		}
		catch(Exception ex) {
	       ex.printStackTrace();
	       ApiResponse<List<EmployeeSummary>> respone = new ApiResponse(true,"Data is  not available",null);
			return new  ResponseEntity (respone , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	

}
