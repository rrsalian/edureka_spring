package com.example.demo;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
    private String deptId;
    private String deptName;
    
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
