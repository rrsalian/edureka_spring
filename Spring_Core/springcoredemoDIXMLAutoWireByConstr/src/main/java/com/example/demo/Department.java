package com.example.demo;

public class Department {

    private HeadUnit headUnit;   

    private String DeptId;
    private String DeptName;

    public Department() {

    }
    
    public Department(HeadUnit headUnit) {
        this.headUnit = headUnit;
    }

    public HeadUnit getHeadUnit() {
        return headUnit;
    }     
    
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
