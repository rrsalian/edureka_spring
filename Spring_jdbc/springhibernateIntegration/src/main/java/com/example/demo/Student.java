package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// will tell that this class is an entity class managed by hibernate
@Entity
//this annotation will tell this class Student is mapped to student Table
@Table(name="student")
public class Student {
    //this will tell that this property is mapped to Primary key column in student table
    @Id
    //this annotation will tell this property studentid is mapped to Student_id column
    @Column(name="student_id")    
    private int studentId;

    @Column(name="student_name")
    private String studentName;
    
    @Column(name="student_city")
    private String studentCity;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentCity() {
        return studentCity;
    }
    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

}
