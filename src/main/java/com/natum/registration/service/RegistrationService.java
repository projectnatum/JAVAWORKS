package com.natum.registration.service;

import com.natum.registration.entity.CustomerDAO;
import com.natum.registration.model.Customer;

import java.util.List;

public interface RegistrationService {
  List<CustomerDAO> getAllCustomers();

  Customer convertEntityToCustomerModel(CustomerDAO customerDAO);

  CustomerDAO saveCustomers(CustomerDAO customerDAO);

  CustomerDAO convertCustomerModelToEntity(Customer customer);
}
