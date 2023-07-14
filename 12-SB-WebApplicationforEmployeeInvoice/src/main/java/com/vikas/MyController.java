package com.vikas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "employee";
	}
	@RequestMapping("/req1")
	public String printInvoice(@RequestParam int id, @RequestParam String name, @RequestParam Double salary, 
			ModelMap model) {
		double ta=0.0;
		double da=0.0;
		double hra=0.0;
		double pf=0.0;
		if(salary<30000) {
			ta= salary*7/100;
			da= salary*9/100;
			hra= salary*11/100;
			pf=salary*15/100;
		}
		else if(salary>30000 && salary>50000) {
			ta= salary*12/100;
			da= salary*13/100;
			hra= salary*17/100;
			pf=salary*22/100;
		}
		else {
			ta= salary*17/100;
			da= salary*19/100;
			hra= salary*21/100;
			pf=salary*25/100;
		}
		double gross_salary=salary+ta+da+hra;
		double net_salary=gross_salary-pf;
		model.put("id", id);
		model.put("name", name);
		model.put("salary", salary);
		model.put("ta", ta);
		model.put("da", da);
		model.put("hra", hra);
		model.put("pf", pf);
		model.put("gross_salary", gross_salary);
		model.put("net_salary", net_salary);
				return "result";
	}

}
