package com.vikas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "product";
	}
	@RequestMapping("/req1")
	public String printInvoice(@RequestParam int id, @RequestParam String name, @RequestParam long number, 
			@RequestParam String pname, @RequestParam double price, @RequestParam int quantity, ModelMap model) {
		double total_Amount=quantity*price;
		double gst=total_Amount*18/100;
		double total=gst+total_Amount;
		double discount_Amount=0.0;
		if(total<2500) {
			discount_Amount=total*10/100;
		}
		else if(total>=2500 && total<=5000) {
			discount_Amount=total*15/100;
		}
		else {
			discount_Amount=total*30/100;
		}
		double invoice=total-discount_Amount;
		model.put("id", id);
		model.put("name", name);
		model.put("number", number);
		model.put("pname", pname);
		model.put("price", price);
		model.put("quantity", quantity);
		model.put("total_Amount", total_Amount);
		model.put("discount_Amount", discount_Amount);
		model.put("gst", gst);
		model.put("invoice", invoice);
		return "result";
	}
}
