package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String studentPage(ModelMap model) {
		Student student= new Student();
		model.put("student", student);
		formValues(model);
		return "student";
	}
	@RequestMapping("/studentResult")
	public String printStudentResult(@ModelAttribute Student student, ModelMap model) {
		model.put("students", student);
		String fullName=student.getFname()+student.getLname();
		double total=student.getJavaMarks()+student.getHibernateMarks()+student.getSpringBootMarks();
		double avg=total/3;
		String grade=" ";
		if(avg>70) {
			grade="A";
		}
		else if(avg>60) {
			grade="B";
		}
		else if(avg>50) {
			grade="C";
		}
		else {
			grade="Fail";
		}
		model.put("fullName", fullName);
		model.put("total", total);
		model.put("avg", avg);
		model.put("grade", grade);
		return "result";
	}
	private void formValues(ModelMap model) {
		List<String> genders= new ArrayList<String>();
		genders.add("Male");
		genders.add("Female");
		model.addAttribute(genders);
		
		List<String> courses = new ArrayList<String>();
		courses.add("java");
		courses.add("hibernate");
		courses.add("springboot");
		model.addAttribute("courses", courses);
		
	}
}
