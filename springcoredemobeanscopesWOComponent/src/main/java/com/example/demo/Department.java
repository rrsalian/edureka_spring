package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptId;
    private String deptName;
    
    Department(){
        System.out.println("in Department Constructor");
    }
    public String getDeptId() {
        return deptId;
    }
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
