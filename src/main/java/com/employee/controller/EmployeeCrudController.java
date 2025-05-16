package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.ApiResponse;
import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;
import com.employee.service.EmployeeCrudMapperService;
//import com.employee.service.EmployeeCrudService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeCrudController {
	
//	@Autowired
//	private EmployeeCrudService employeeCrudService;
//	
//	@PostMapping
//	public ResponseEntity<ApiResponse<EmployeeResponseDto>> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
//		EmployeeResponseDto createdEmployee = employeeCrudService.createEmployee(employeeRequestDto);
//		ApiResponse<EmployeeResponseDto> reponse = new ApiResponse<EmployeeResponseDto>(true, "Employee created successfully", createdEmployee); 
//		return ResponseEntity.ok(reponse);
//		
//	}
//	
//	@GetMapping("/{id}")
//	    public ResponseEntity<ApiResponse<EmployeeResponseDto>> getEmployeeById(@PathVariable String id) {
//	        EmployeeResponseDto employee = employeeCrudService.getEmployeeById(id);
//	        ApiResponse<EmployeeResponseDto> response = new ApiResponse<>(true,"Employee retrieved successfully",employee );
//	        return ResponseEntity.ok(response);
//	    }
//
//	@PutMapping("/{id}")
//    public ResponseEntity<ApiResponse<EmployeeResponseDto>> updateEmployee(@PathVariable String id,@RequestBody EmployeeRequestDto employeeRequestDto){
//		 EmployeeResponseDto employee =employeeCrudService.updateEmployee(id, employeeRequestDto);
//		 ApiResponse<EmployeeResponseDto> response  = new ApiResponse<>(true,"Employee updated successfully",employee );
//		return ResponseEntity.ok(response);
//		
//	}
//	
//	@GetMapping 
//	ResponseEntity<ApiResponse<List<EmployeeResponseDto>>> getAllEmployee(){
//    List<EmployeeResponseDto> employees = employeeCrudService.getAllEmployees();
//		
//		ApiResponse<List<EmployeeResponseDto>> response = new ApiResponse<>(true," All details Employee successfully",employees );
//		return ResponseEntity.ok(response) ;
//		
//	}
//	
//	@DeleteMapping("/{id}")
//    public ResponseEntity<ApiResponse<Void>> deleteEmployee(@PathVariable String id) {
//		employeeCrudService.deleteEmployee(id);
//        ApiResponse<Void> response = new ApiResponse<>(true, "Employee deleted successfully", null);
//        return ResponseEntity.ok(response);
//    }
	@Autowired
	private EmployeeCrudMapperService employeeCrudService;
	
	@PostMapping
	public ResponseEntity<ApiResponse<EmployeeResponseDto>> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
		EmployeeResponseDto createdEmployee = employeeCrudService.createEmployee(employeeRequestDto);
		ApiResponse<EmployeeResponseDto> reponse = new ApiResponse<EmployeeResponseDto>(true, "Employee created successfully", createdEmployee); 
		return ResponseEntity.ok(reponse);
		
	}
	
	@GetMapping("/{id}")
	    public ResponseEntity<ApiResponse<EmployeeResponseDto>> getEmployeeById(@PathVariable String id) {
	        EmployeeResponseDto employee = employeeCrudService.getEmployeeById(id);
	        ApiResponse<EmployeeResponseDto> response = new ApiResponse<>(true,"Employee retrieved successfully",employee );
	        return ResponseEntity.ok(response);
	    }

	@PutMapping("/{id}")
    public ResponseEntity<ApiResponse<EmployeeResponseDto>> updateEmployee(@PathVariable String id,@RequestBody EmployeeRequestDto employeeRequestDto){
		 EmployeeResponseDto employee =employeeCrudService.updateEmployee(id, employeeRequestDto);
		 ApiResponse<EmployeeResponseDto> response  = new ApiResponse<>(true,"Employee updated successfully",employee );
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping 
	ResponseEntity<ApiResponse<List<EmployeeResponseDto>>> getAllEmployee(){
    List<EmployeeResponseDto> employees = employeeCrudService.getAllEmployees();
		
		ApiResponse<List<EmployeeResponseDto>> response = new ApiResponse<>(true," All details Employee successfully",employees );
		return ResponseEntity.ok(response) ;
		
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteEmployee(@PathVariable String id) {
		employeeCrudService.deleteEmployee(id);
        ApiResponse<Void> response = new ApiResponse<>(true, "Employee deleted successfully", null);
        return ResponseEntity.ok(response);
    }

}
