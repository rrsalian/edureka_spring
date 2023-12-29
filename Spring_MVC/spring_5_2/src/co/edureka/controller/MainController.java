package co.edureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	
	@RequestMapping("/")
	public String firstScreen(){
		return "home";
	}
	
	@RequestMapping("home")
	public String homeScreen(){
		return "home";
	}
	
	@RequestMapping("/mongodb")
	public String mongoScreen(){
		return "mongodb";
	}
	
	
	
	
}
