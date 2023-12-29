package com.springmvcxmlstudent;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
    public int saveNewStudent(Student student) {
        Map<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("first_Name", student.getFirstName());
        parameters.put("last_Name", student.getLastName());
        parameters.put("age", student.getAge());
        parameters.put("postal_code", student.getPostalCode());
        parameters.put("course_code", student.getCourseCode());
        System.out.println("Before insert into Student");
        int count = namedParameterJdbcTemplate.update("insert into student values(:first_Name,:last_Name,:postal_code,:age,:course_code)", parameters);
        System.out.println("Student Saved from DAO saveNewStudent method to database");
        return count;
    }
}
