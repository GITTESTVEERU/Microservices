package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Account;

@RestController
public class AccountDetailsController {

	@Value("${server.port}")
	String port;
	
	@RequestMapping(value="/getAcctDetails/{id}", method=RequestMethod.GET)
	public Account getAccountDetails(@PathVariable Integer id) {
		
		Account acct = new Account();
		acct.setCustomerName("Veeru");
		acct.setAccountActive(true);
		acct.setAccountBalance(300000.00);
		acct.setPort(port);
		return acct;
	}
	
	@RequestMapping("/hellow")
	public String getHello() {
		return "Hello welcome to microservice training...";
	}
}
