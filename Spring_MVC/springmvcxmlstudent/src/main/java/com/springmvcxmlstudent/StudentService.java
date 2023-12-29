package com.springmvcxmlstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;
    
    public int saveStudent(Student student) {
        
    	System.out.println(student.getFirstName());
    	return studentDAO.saveNewStudent(student);
    }    
}