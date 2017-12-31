package com.natum.registration.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.natum.registration.entity.Customer;
import com.natum.registration.model.CustomerModel;


public interface RegistrationDAOInterface{
	
//	public void saveCustomers();

	// Customer findByUsername(String custFirstName);
	//Customer findByEmail(String custEmail);
//	Customer findBycustFirstName(String custFirstName);
	// Customer findBycustEmail(String custEmail);
	Customer saveCustomers(Customer customer);
	Customer convertCustomerModelToEntity(CustomerModel customerModel);
	CustomerModel convertEntityToCustomerModel(Customer customer);
	List<Customer> getAllCustomers();
	
	
	
	
	
	
}
