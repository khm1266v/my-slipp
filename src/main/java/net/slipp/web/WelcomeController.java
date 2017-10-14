package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

		 
		 @Controller
		 public class WelcomeController {
		 	@GetMapping("/helloworld")
		 	public String welcome(String name, int age, Model model) {
		 		name="woogunJung";
		 		age =27;
		 		System.out.println("name :"+name + "age :" +age);
		 		model.addAttribute("name", name);
		 		model.addAttribute("age",age);
		 		return "welcome";
		 	}
		 }


