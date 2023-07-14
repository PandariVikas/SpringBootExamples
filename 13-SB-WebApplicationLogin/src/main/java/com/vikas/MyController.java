package com.vikas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	@RequestMapping("/req1")
	public String printInvoice(@RequestParam String name, @RequestParam String pswd, ModelMap model) {
		model.put("name", name);
		model.put("pswd", pswd);
		String res=null;
		if(name.equalsIgnoreCase("vikas") && pswd.equals("vikas@123")) {
			res="Login Success";
		}
		else {
			res="login fail your enter wrong details";
		}
		model.put("res", res);
		return "result";
	}

}
