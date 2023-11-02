package com.example.demo;

public class Employee {
    private String EmpId;
    private String EmpName;
    private Department department;
    private Department dept;

    public String getEmpId() {
        return EmpId;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpId(String empId) {
        EmpId = empId;
    }
    public void setEmpName(String empName) {
        EmpName = empName;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Department getDept() {
        return dept;
    }
    public void setDept(Department dept) {
        this.dept = dept;
    }  
    
}
