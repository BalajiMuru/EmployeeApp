package com.employee.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;
import com.employee.mapper.EmployeeMapper;
import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeCrudMapperService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto) {
	     Employee emp =	modelMapper.map(requestDto, Employee.class);
	     Employee  saved =  employeeRepo.save(emp);
		 return modelMapper.map(saved, EmployeeResponseDto.class);
	}	 
//    public List<EmployeeResponseDto> getAllEmployees(){
//    	List<Employee>  emps = employeeRepo.findAll();
//    	return emps.stream().map(emp->modelMapper.map(emps, EmployeeResponseDto.class)).collect(Collectors.toList());
//    }	
    public List<EmployeeResponseDto> getAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeResponseDto.class)) // Map each entity to DTO
                .collect(Collectors.toList());
    }
    
    public EmployeeResponseDto getEmployeeById(String id) {
    	Employee existEmployee = employeeRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id:" + id));
    	EmployeeResponseDto dto =modelMapper.map(existEmployee, EmployeeResponseDto.class);
		return dto;
    	
    }
    
		
    public EmployeeResponseDto updateEmployee(String id, EmployeeRequestDto requestDto)	{
    	Employee existEmployee = employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id:" + id));
        modelMapper.map(existEmployee,requestDto);
        Employee updatedEmployee = employeeRepo.save(existEmployee);
        EmployeeResponseDto emps = modelMapper.map(existEmployee, EmployeeResponseDto.class);
        return emps;	
    	
   }
    
    public void deleteEmployee(String id) {
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        employeeRepo.delete(existingEmployee);
    }
		
	
	
	

}
