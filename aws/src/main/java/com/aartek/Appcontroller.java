package com.aartek;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Appcontroller {
	
	@RequestMapping(value= {"/","/home"}, method = RequestMethod.GET)
	public String getHomePage() {
		System.out.println("dfjj");
		return "home";
	}

}
