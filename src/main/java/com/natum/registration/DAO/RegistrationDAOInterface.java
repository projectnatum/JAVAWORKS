package com.natum.registration.DAO;

import com.natum.registration.entity.CustomerDAO;
import com.natum.registration.model.Customer;

import java.util.List;

public interface RegistrationDAOInterface {
  CustomerDAO saveCustomers(CustomerDAO customerDAO);

  CustomerDAO convertCustomerModelToEntity(Customer customer);

  Customer convertEntityToCustomerModel(CustomerDAO customerDAO);

  List<CustomerDAO> getAllCustomers();

}
