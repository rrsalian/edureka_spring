package com.example.demo;

public class Employee {
    
    private String EmpId;
    private String EmpName;
    private Department department;

    public String getEmpId() {
        return EmpId;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setEmpId(String empId) {
        EmpId = empId;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String empName) {
        EmpName = empName;
    } 
}
