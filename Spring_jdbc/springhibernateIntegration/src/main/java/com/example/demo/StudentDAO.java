package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class StudentDAO {
   
    @Autowired
    SessionFactory sessionFactory;

    public Student getStudent(int studentId) {
        // create hibernate session
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, studentId);
        return student;
    }

    public void createStudent(Student student) {
        // create hibernate session
        Session session = sessionFactory.getCurrentSession();        
        //session.save(student);
        session.persist(student);
    }

}
