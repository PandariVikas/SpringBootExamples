package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String employeePage(ModelMap model) {
		Employee employee= new Employee();
		model.put("employee", employee);
		return "emp";	
	}
	@RequestMapping("/Employee")
	public String printInvoice(@ModelAttribute Employee employee,ModelMap model) {
		double ta=0.0;
		double da=0.0;
		double hra=0.0;
		double pf=0.0;
		double sal=employee.getSalary();
		if(sal<30000) {
			ta=sal*7/100;
			da=sal*9/100;
			hra=sal*11/100;
			pf=sal*15/100;
		}
		else if(sal>=30000 && sal>=50000) {
			ta=sal*12/100;
			da=sal*13/100;
			hra=sal*17/100;
			pf=sal*22/100;
		}
		else {
			ta=sal*17/100;
			da=sal*19/100;
			hra=sal*21/100;
			pf=sal*25/100;
		}
		double gross_salary=sal+ta+da+hra;
		double net_salary=gross_salary-pf;
		model.put("ta",ta);
		model.put("da",da);
		model.put("hra",hra);
		model.put("pf",pf);
		model.put("gross_salary", gross_salary);
		model.put("net_salary", net_salary);
		return "result";	
	}
}
