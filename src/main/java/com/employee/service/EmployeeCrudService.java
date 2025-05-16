//package com.employee.service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.employee.dto.EmployeeRequestDto;
//import com.employee.dto.EmployeeResponseDto;
//import com.employee.mapper.EmployeeCrudMapper;
//import com.employee.model.Employee;
//import com.employee.repo.EmployeeRepo;
//
//@Service
//public class EmployeeCrudService {
//	
//	@Autowired
//	private EmployeeRepo employeeRepository;
//
//	@Autowired
//	private EmployeeCrudMapper employeeCrudMapper;
//   
//
//    // CREATE
//    public EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto) {
//    	Employee emp = employeeCrudMapper.mapToEntity(requestDto);
//    	Employee savedEmployee = employeeRepository.save(emp);
//    	return employeeCrudMapper.mapToResponseDto(savedEmployee);
//         
//    }
//
//    // READ ALL
////    public List<EmployeeResponseDto> getAllEmployees() {
////        List<Employee>emp = employeeRepository.findAll();
////		return emp.stream().map(this::mapToResponseDto)
////                .collect(Collectors.toList());
////    }
//    public List<EmployeeResponseDto> getAllEmployees() {
//        List<Employee> employees = employeeRepository.findAll();
//        return employees.stream()
//                .map(employeeCrudMapper::mapToResponseDto) // Use the mapper object here
//                .collect(Collectors.toList());
//    }
//
//
//    // READ BY ID
//    public EmployeeResponseDto getEmployeeById(String id) {
//     Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
//     EmployeeResponseDto emps = employeeCrudMapper.mapToResponseDto(employee);
//     return emps;
//    }
//
//   
//    // UPDATE
//    public EmployeeResponseDto updateEmployee(String id, EmployeeRequestDto requestDto) {
//        Employee existingEmployee = employeeRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
//
//        // Update fields
//        existingEmployee.setName(requestDto.getName());
//        existingEmployee.setDepartment(requestDto.getDepartment());
//        existingEmployee.setSalary(requestDto.getSalary());
//
//        Employee updatedEmployee = employeeRepository.save(existingEmployee);
//        return employeeCrudMapper.mapToResponseDto(updatedEmployee);
//    }
//
//
//    // DELETE
//    // DELETE
//    public void deleteEmployee(String id) {
//        Employee existingEmployee = employeeRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
//        employeeRepository.delete(existingEmployee);
//    }
//
////	
//////	public EmployeeResponseDto mapToResponseDto(Employee employee) {
//////	    return new EmployeeResponseDto(
//////	        employee.getId(),
//////	        employee.getName(),
//////	        employee.getDepartment(),
//////	        employee.getSalary()
//////	    );
//////	}
////    public EmployeeResponseDto mapToResponseDto(Employee employee) {
////    	EmployeeResponseDto dto = new EmployeeResponseDto();
////    	dto.setId(employee.getId());
////    	dto.setName(employee.getName());
////    	dto.setSalary(employee.getSalary());
////    	dto.setDepartment(employee.getDepartment());
////		return dto;
////    	
////    }
////	
////
////	 public  Employee mapToEntity(EmployeeRequestDto requestDto) {
////	        if (requestDto == null) {
////	            return null;
////	        }
////
////	        Employee employee = new Employee();
////	        employee.setId(requestDto.getId());
////	        employee.setName(requestDto.getName());
////	        employee.setDepartment(requestDto.getDepartment());
////	        employee.setSalary(requestDto.getSalary());
////
////	        return employee;
////	    }
//}
