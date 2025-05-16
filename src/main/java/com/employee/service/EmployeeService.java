package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeSummary;
import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;				

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	public List<EmployeeSummary> getEmployeeSummary() {
//	List<Object[]> employees = employeeRepo.findEmployeeSummaryByDepartment();
	List<Object[]> employees = employeeRepo.findEmployeeSummaryByDepartment();
	List<EmployeeSummary> summaryList = new ArrayList<EmployeeSummary>();
	
	for(Object[] data : employees)
	{
		 String department = (String) data[0];
         Long totalEmployees = ((Number) data[1]).longValue();
         Double totalSalary = ((Number) data[2]).doubleValue();
         
         summaryList .add(new EmployeeSummary(department,totalEmployees,totalSalary));
         summaryList.add(new EmployeeSummary("it",2l,56689.9));
	}

	
	return summaryList	;
	}

}
