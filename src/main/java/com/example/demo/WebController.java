package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

	// Html pages url
public class WebController {
	
	@RequestMapping(value="/")
	   public String login() {
		   return "login";
   }
	@RequestMapping(value="/signup")
	   public String signup() {
		   return "signup";
}
	@RequestMapping(value="/forgotpass")
	   public String forgotpass() {
		   return "forgotpass";
}
   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   @RequestMapping(value = "/addProduct")
   public String addProduct() {
      return "addProduct";
   }
   @RequestMapping(value = "/updateProduct")
   public String updateProduct() {
      return "updateProduct";
   }
   @RequestMapping(value = "/deleteProduct")
   public String deleteProduct() {
      return "deleteProduct";
   }
   
}
