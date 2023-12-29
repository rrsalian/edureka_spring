package co.edureka.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import org.springframework.web.servlet.ModelAndView;

import co.edureka.bean.User;


@Controller
public class LoginController {
	
	@RequestMapping("/")
	public ModelAndView firstScreen(){
		 return new ModelAndView("login", "user", new User());
	}
	
	@RequestMapping(value="checkLogin", method=RequestMethod.POST)
	public String checkLogin(Model model, @Valid User user, BindingResult result){
		
		if(result.hasErrors()){
			return "login";
		}
		else if(result.hasErrors()==false){
			
			if(user.getUsername().equals("edureka") && user.getPassword().equals("12345")){
				model.addAttribute("user", user.getUsername());
				return "home";
			}else{
				model.addAttribute("message"," Invalid username or password !!! ");
			}
			
		}
		return "login";
	}
}
