package com.sinhgad.pune;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginSignupController {
 // New url which i have is /login it asks controller to map this request to its function
	@RequestMapping("/")
	public String display() {
		return "index";
	}
	
	
	// HttpServletRequest, HttServletRespone
	@RequestMapping("/login")
	public String Login(
	@RequestParam("username") String username,
	@RequestParam("password") String password,
	Model model) {
		if(username.equalsIgnoreCase("admin") &&
				password.equalsIgnoreCase("admin")) {
			String valid = "Welcome " + username + " you are valid user";
			model.addAttribute("message", valid);
			return "valid";
		}
		else {
			String invalid = "Welcome "+username+" you are invalid user";
			model.addAttribute("message",invalid);
			return "errorpage";
		}
	}
	
	// HttpServletRequest, HttServletRespone
		@RequestMapping("/signup")
		public String Signup(
		@RequestParam("username") String username,
		@RequestParam("password") String password,
		@RequestParam("email") String email,
		Model model) {
			
				String valid = "Welcome your details are " 
				+ username + ", "+password+", "+email;
				model.addAttribute("message", valid);
				return "valid";
		}

// controller will bind "index" name as ModelandView
}
