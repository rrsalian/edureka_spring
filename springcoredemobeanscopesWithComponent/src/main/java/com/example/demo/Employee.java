package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Employee {
    
    private String EmpId;
    private String EmpName;
    
    @Autowired
    @Qualifier("department")
    private Department dept;

    public Employee() {
        System.out.println("Employee Contructor");
    }
    public String getEmpId() {
        return EmpId;
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
    public Department getDept() {
        return dept;
    }
    public void setDept(Department dept) {
        this.dept = dept;
    } 
}
