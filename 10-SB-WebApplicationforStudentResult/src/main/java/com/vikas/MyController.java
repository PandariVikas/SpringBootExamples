package com.vikas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "student";
	}
	@RequestMapping("/req1")
	public String printResult(@RequestParam int id, @RequestParam String fname, @RequestParam String lname, @RequestParam int javaMarks, @RequestParam int hibarnateMarks, @RequestParam int springBootMarks,  ModelMap model) {
		String fullName=fname+lname;
		int total=javaMarks+hibarnateMarks+springBootMarks;
		double per=total/3;
		char grade=' ';
		if (per>70) {
		grade='A';	
		}
		else if (per>60) {
			grade='B';	
			}
		else if (per>50) {
			grade='C';	
			}
		else {
			grade='F';	
			}
		model.put("id", id);
		model.put("fullName", fullName);
		model.put("javaMarks", javaMarks);
		model.put("hibarnateMarks", hibarnateMarks);
		model.put("springBootMarks", springBootMarks);
		model.put("total", total);
		model.put("per", per);
		model.put("grade", grade);
		return "result";
	}
}
