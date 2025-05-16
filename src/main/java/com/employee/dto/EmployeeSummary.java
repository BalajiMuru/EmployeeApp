package com.employee.dto;



public class EmployeeSummary {

    private String department;
    private Long totalEmployees;
    private Double totalSalary;

    public EmployeeSummary(String department, Long totalEmployees, Double totalSalary) {
        this.department = department;
        this.totalEmployees = totalEmployees;
        this.totalSalary = totalSalary;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Long totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }
}

