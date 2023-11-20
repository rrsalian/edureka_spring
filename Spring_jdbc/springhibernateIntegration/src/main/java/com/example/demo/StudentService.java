package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class StudentService {
    @Autowired
    StudentDAO studentDAO;

    public Student getStudentbyId(int studentId) {
        Student student = studentDAO.getStudent(studentId);
        return student;
    }

    public void createStudent(Student student) {
        studentDAO.createStudent(student);
    }

}
