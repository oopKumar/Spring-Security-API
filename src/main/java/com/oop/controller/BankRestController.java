package com.oop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to SBI";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		
		return "Funds transfer Initiated ...";
	}

	
	@GetMapping("/balance")
	public String checkBalance() {
		
		return "Your Account Balance is 10000.00 ...";
	}
	
	
	@GetMapping("/about")
	public String AboutUs() {
		
		return "SBI bank Managed by Indian Central Government ...";
	}

	

	
	
	
}
