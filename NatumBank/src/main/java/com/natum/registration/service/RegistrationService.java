package com.natum.registration.service;

import java.util.List;

import com.natum.registration.entity.Customer;
import com.natum.registration.model.CustomerModel;

public interface RegistrationService {

	public List<Customer> getAllCustomers();

	public CustomerModel convertEntityToCustomerModel(Customer customer);

	public Customer saveCustomers(Customer customer);

	public Customer convertCustomerModelToEntity(CustomerModel customerModel);

	// Customer saveCustomers(Customer customer);
	//
	// Customer convertCustomerModelToEntity(CustomerModel customerModel);
	//
	// CustomerModel convertEntityToCustomerModel(Customer customer);
	//
	// List<Customer> getAllCustomers();

}
