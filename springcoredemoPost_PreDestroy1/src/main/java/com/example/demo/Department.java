package com.example.demo;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
    private String DeptId;
    private String DeptName;
    
    public String getDeptId() {
        return DeptId;
    }
    public void setDeptId(String deptId) {
        DeptId = deptId;
    }
    public String getDeptName() {
        return DeptName;
    }
    public void setDeptName(String deptName) {
        DeptName = deptName;
    }    
}
