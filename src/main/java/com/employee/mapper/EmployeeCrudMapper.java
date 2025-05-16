package com.employee.mapper;

import org.springframework.stereotype.Component;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;
import com.employee.model.Employee;

@Component
public class EmployeeCrudMapper {
//	public EmployeeResponseDto mapToResponseDto(Employee employee) {
//    return new EmployeeResponseDto(
//        employee.getId(),
//        employee.getName(),
//        employee.getDepartment(),
//        employee.getSalary()
//    );
//}
public EmployeeResponseDto mapToResponseDto(Employee employee) {
	EmployeeResponseDto dto = new EmployeeResponseDto();
	dto.setId(employee.getId());
	dto.setName(employee.getName());
	dto.setSalary(employee.getSalary());
	dto.setDepartment(employee.getDepartment());
	return dto;
	
}


 public  Employee mapToEntity(EmployeeRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setId(requestDto.getId());
        employee.setName(requestDto.getName());
        employee.setDepartment(requestDto.getDepartment());
        employee.setSalary(requestDto.getSalary());

        return employee;
    }
}
