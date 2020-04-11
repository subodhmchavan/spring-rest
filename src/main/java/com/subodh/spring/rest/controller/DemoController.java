package com.subodh.spring.rest.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subodh.spring.rest.jpa.Login;
import com.subodh.spring.rest.service.ILoginService;

@RestController
public class DemoController {
	
	Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	ILoginService loginService;
	

	@GetMapping(path = "/")
	public String index() {
		log.info("In INDEX method ######### " + loginService.findAll());
		loginService.save(new Login("hulk", "hulk123"));
	    return loginService.findAll().get(0).getUsername();
	}
	     
	@GetMapping(path = "/customers")
	public String customers() {	
		log.info("In CUSTOMER method");
		
	    return "Custom URL works";
	}
	
}
