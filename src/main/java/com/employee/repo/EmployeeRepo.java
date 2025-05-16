package com.employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
//	@Query(nativeQuery = true, value = "SELECT id,name, department, COUNT(*) AS total_employees, SUM(salary) AS total_salary " +
//            "FROM employee " +
//            "GROUP BY department " +
//            "ORDER BY department")
//    List<Object[]> findEmployeeSummaryByDepartment();
	
	@Query(nativeQuery = true, value = "SELECT department, COUNT(*) AS total_employees, SUM(salary) AS total_salary " +
            "FROM employee " +
            "GROUP BY department " +
            "ORDER BY department")
	List<Object[]> findEmployeeSummaryByDepartment();
}
