package com.natum.registration.controller;

import com.natum.registration.entity.CustomerDAO;
import com.natum.registration.model.Customer;
import com.natum.registration.service.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/natum/customers")
@CrossOrigin
public class RegistrationController {
  private static Logger log = Logger.getLogger(RegistrationController.class);

  @Autowired
  private RegistrationService registrationService;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Customer createCustomer(@RequestBody Customer customer, HttpServletRequest request, HttpServletResponse response, Model model) {
    CustomerDAO customerDAO = registrationService.convertCustomerModelToEntity(customer);
    customerDAO = registrationService.saveCustomers(customerDAO);
    customer = registrationService.convertEntityToCustomerModel(customerDAO);
    return customer;
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<CustomerDAO> getCustomers(HttpServletRequest request, HttpServletResponse response) {
    return registrationService.getAllCustomers();
  }
}
