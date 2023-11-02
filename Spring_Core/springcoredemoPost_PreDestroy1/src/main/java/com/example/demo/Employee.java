package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// import jakarta.annotation.PostConstruct;
// import jakarta.annotation.PreDestroy;

@Component
public class Employee implements InitializingBean, DisposableBean{
    private String EmpId;
    private String EmpName;

    @Autowired
    @Qualifier("dept")
    private Department dept;

    public Employee() {
        //iniitialize employee object property values
        System.out.println("in Employee constructor - dept object is " + dept);
    }

    // this is run immediately after constructor has been run. 
    // Usually we run the setter methods of the dependent methods

    // @PostConstruct
    // public void afterConstruct() {
    //     //Initialize employee dependent object property values
    //     System.out.println("in post Construct - dept object is " + dept);
    // }

    @Override
    public void afterPropertiesSet() throws Exception {        
        System.out.println("in postContruct/ afterPropertiesSet method " + dept);
    } 

    // this runs from context.close methos and here we destroy all db / file connections if any
    
    // @PreDestroy
    // public void beforeDestroy() {
    //     //close any Db or file connections before bean gets destroyed
    //     System.out.println("in pre destroy");
    // }

    @Override  // equal to PreDestroy
    public void destroy() throws Exception {        
       System.out.println("Before bean destroy " + dept);
    }

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
    
    public Department getDept() {
        return dept;
    }
    
    public void setDept(Department dept) {
        System.out.println("in set Department");
        this.dept = dept;
    }    
}
