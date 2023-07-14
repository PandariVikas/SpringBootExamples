package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
 @RequestMapping("/")
 	public String productPage(ModelMap model) {
	 Product product= new Product();
	 model.put("product", product);
		return "product";
 }
 @RequestMapping("/productInvoice")
	public String productInvoice(@ModelAttribute Product product, ModelMap model) {
	 	double total=0.0;
	 	double discount=0.0;
	 	double invoiceBill=0.0;
	 	total=product.getPrice()*product.getQuantity();
	 	if(total<5000) {
	 		discount= total*15/100;
	 	}else if(total>5000) {
	 	discount=total*20/100;
	 	}
	 	else {
	 		discount=total*25/100;
	 	}
	 	invoiceBill=total-discount;
	 	model.put("products", product);
	 	model.put("total", total);
	 	model.put("discount", discount);
	 	model.put("invoice", invoiceBill);
		return "result";
}
}
