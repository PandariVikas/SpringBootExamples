package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/")
	public String userPage(ModelMap model) {
		User user = new User();
		model.put("user", user);
		formValues(model);
		return "register";
	}
	@RequestMapping("/register")
	public String registerPage(@ModelAttribute User user, ModelMap model) {
		model.put("users", user);
		return "result";
	}
	private void formValues(ModelMap model) {
		List<String> genders=new ArrayList<String>();
		genders.add("male");
		genders.add("female");
		model.addAttribute(genders);
		
		List<String> courses = new ArrayList<String>();
		courses.add("java");
		courses.add("advjava");
		courses.add("spring");
		courses.add("springboot");
		courses.add("html");
		courses.add("hibernate");
		model.addAttribute(courses);
		
		List<String> batches= new ArrayList<String>();
		batches.add("morning");
		batches.add("evening");
		model.addAttribute(batches);
	}	
		
	
}
