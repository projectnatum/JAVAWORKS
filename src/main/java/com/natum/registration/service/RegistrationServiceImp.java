package com.natum.registration.service;

import java.util.List;

import com.natum.registration.entity.CustomerDAO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.natum.registration.DAO.RegistrationDAOInterface;
import com.natum.registration.model.Customer;

@Service
public class RegistrationServiceImp implements RegistrationService {
	private static Logger logger=Logger.getLogger(RegistrationServiceImp.class);
	
	@Autowired
	public RegistrationDAOInterface registrationDAO;

	
	@Override
	public List<CustomerDAO> getAllCustomers() {
		return registrationDAO.getAllCustomers();
		
	}

	@Override
	public Customer convertEntityToCustomerModel(CustomerDAO customer) {
		// TODO Auto-generated method stub
		return registrationDAO.convertEntityToCustomerModel(customer);
	}

	@Override
	@Transactional
	public CustomerDAO saveCustomers(CustomerDAO customerDAO) {
		// TODO Auto-generated method stub
		return registrationDAO.saveCustomers(customerDAO);
	}

	@Override
	public CustomerDAO convertCustomerModelToEntity(Customer customer) {
		// TODO Auto-generated method stub
		return registrationDAO.convertCustomerModelToEntity(customer);
	}
	

	
}
