package com.natum.registration.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.natum.registration.DAO.RegistrationDAOInterface;
import com.natum.registration.entity.Customer;
import com.natum.registration.model.CustomerModel;

@Service
public class RegistrationServiceImp implements RegistrationService {
	private static Logger logger=Logger.getLogger(RegistrationServiceImp.class);
	
	@Autowired
	public RegistrationDAOInterface registrationDAO;

	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		logger.debug("Entry: getAllCustomers() in regService.");
		return registrationDAO.getAllCustomers();
		
	}

	@Override
	public CustomerModel convertEntityToCustomerModel(Customer customer) {
		// TODO Auto-generated method stub
		return registrationDAO.convertEntityToCustomerModel(customer);
	}

	@Override
	@Transactional
	public Customer saveCustomers(Customer customer) {
		// TODO Auto-generated method stub
		return registrationDAO.saveCustomers(customer);
	}

	@Override
	public Customer convertCustomerModelToEntity(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		return registrationDAO.convertCustomerModelToEntity(customerModel);
	}
	

	
}