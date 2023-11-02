package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // @bean will be used even if component is present
public class Employee {
    
    private String EmpId;
    private String EmpName;
    
    @Autowired
    @Qualifier("department")
    private Department dept;

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
