package com.natum.registration.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.natum.registration.entity.Customer;
import com.natum.registration.model.CustomerModel;
import com.natum.registration.service.RegistrationService;

@RestController
@RequestMapping(value="/api/customers")
@CrossOrigin
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService registrationService;
	
	private static Logger logger= Logger.getLogger(RegistrationController.class);	
	
	@RequestMapping(
			value ="", 
			method = RequestMethod.POST, 
			consumes = { "application/json","application/xml" }, 
			produces = { "application/json", "application/xml" })
	public CustomerModel createCutomer(@RequestBody CustomerModel customerModel,HttpServletRequest request, HttpServletResponse response,Model model) {
		logger.debug("Entry: customerModel from registrationController "+customerModel);
		
		//Customer customer=new Customer();		
		//model.addAttribute("customer",customer);
		Customer customer=registrationService.convertCustomerModelToEntity(customerModel);
		customer= registrationService.saveCustomers(customer);
		customerModel=registrationService.convertEntityToCustomerModel(customer);
		logger.debug("Exit: customerModel from registrationController "+customerModel);
		return customerModel;
		}
	
	@RequestMapping(value="",method=RequestMethod.GET, produces= {"application/json","application/xml"})
	public List<Customer> getCustomers(HttpServletRequest request,HttpServletResponse response) {
		//List<CustomerModel> customerModel=new ArrayList<CustomerModel>();
		List<Customer> customers=registrationService.getAllCustomers();		
		return customers;
		
	}
	
	
//	
//	@RequestMapping(value="/login")
//	@ResponseBody
//	public String login() {
//		return "you are in login page";
//	}
	
	}