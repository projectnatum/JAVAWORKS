package com.natum.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natum.registration.model.CustomerModel;

@RestController
@RequestMapping(value="/api/customers")
@CrossOrigin
public class RegistrationController {
	
	private static Logger logger= Logger.getLogger(RegistrationController.class);	
	
	@RequestMapping(
			value ="", 
			method = RequestMethod.POST, 
			consumes = { "application/json","application/xml" }, 
			produces = { "application/json", "application/xml" })
	public CustomerModel createCutomer(@RequestBody CustomerModel customerModel,HttpServletRequest request, HttpServletResponse response) {
		logger.info("Entry: "+customerModel);
		return customerModel;
		}
	
	@RequestMapping(value="",method=RequestMethod.GET, produces= {"application/json","application/xml"})
	public CustomerModel getCustomers(HttpServletRequest request,HttpServletResponse response) {
		CustomerModel customerModel=new CustomerModel();
		return customerModel;
		
	}
	
	
//	
//	@RequestMapping(value="/login")
//	@ResponseBody
//	public String login() {
//		return "you are in login page";
//	}
	
	}