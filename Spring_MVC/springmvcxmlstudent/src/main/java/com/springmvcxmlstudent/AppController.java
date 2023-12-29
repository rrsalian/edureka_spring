package com.springmvcxmlstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	StudentService studentService;

//  @RequestMapping("/showStudentRegForm")
//	public String showRegForm() {
//		return "student-registration-form";
//	}

	@RequestMapping("/showStudentRegistration")
	public String showRegistrationForm(@ModelAttribute Student student) {
		return "student-reg-form";
	}

	@RequestMapping("/processForm")
	public String processRegForm(@ModelAttribute Student student) {
		// call service, service will call DAO , using dao we can use spring JDBC or hibernate to insert into db
		studentService.saveStudent(student);
		//System.out.print(student.getFirstName() + " " + student.getAge() );
		
		return "studentdetailsconfirmation";
	}	
}
