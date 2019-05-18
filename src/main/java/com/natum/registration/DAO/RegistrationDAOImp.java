package com.natum.registration.DAO;

import com.natum.registration.entity.CustomerDAO;
import com.natum.registration.model.Customer;
import com.natum.registration.model.Passwords;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

@Service
public class RegistrationDAOImp implements RegistrationDAOInterface {
  private static Logger logger = Logger.getLogger(RegistrationDAOImp.class);

  @Autowired
  public SessionFactory sessionFactory;

  @Override
  @Transactional
  public CustomerDAO saveCustomers(CustomerDAO customerDAO) {
    try {
      Session session = sessionFactory.getCurrentSession();
      session.save(customerDAO);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return customerDAO;
  }

  @Override
  public CustomerDAO convertCustomerModelToEntity(Customer customerModel) {

    CustomerDAO customerDAO = new CustomerDAO();
    //	Passwords passwords=new Passwords();
    customerDAO.setCustDOB(customerModel.getCustDOB());
    customerDAO.setCustEmail(customerModel.getCustEmail());
    customerDAO.setCustFirstName(customerModel.getCustFirstName());
    customerDAO.setCustLastName(customerModel.getCustLastName());
    customerDAO.setCustSSN(customerModel.getCustSSN());
    customerDAO.setCustZip(customerModel.getCustZip());
    customerDAO.setCustPassword(customerModel.getPasswords().getCustPassword());

    return customerDAO;
  }

  public Customer convertEntityToCustomerModel(CustomerDAO customerDAO) {
    // TODO Auto-generated method stub
    logger.info("Entry: convertEntityToCusomterModel" + customerDAO);
    Customer customer = new Customer();
    customer.setCustDOB(customerDAO.getCustDOB());
    customer.setCustEmail(customerDAO.getCustEmail());
    customer.setCustFirstName(customerDAO.getCustFirstName());
    customer.setCustId(customerDAO.getCustId());
    customer.setCustLastName(customerDAO.getCustLastName());
    customer.setCustSSN(customerDAO.getCustSSN());
    customer.setCustZip(customerDAO.getCustZip());


    Passwords passwords = new Passwords();
    passwords.setCustPassword(customerDAO.getCustPassword());
    customer.setPasswords(passwords);

    return customer;
  }

  @Override
  @Transactional
  public List<CustomerDAO> getAllCustomers() {
    // TODO Auto-generated method stub
    logger.debug("Entry: RegistrationServiceImp, getAllCustomers()");
    List<CustomerDAO> customers = new ArrayList<>();
    Query query = null;
    Session session = null;
    try {
      session = sessionFactory.getCurrentSession();
      query = session.createQuery("from customers order by cust_Id");
      customers = query.list();
    } catch (Exception e) {
      e.printStackTrace();
    }/* finally {
      if (session != null) {
        session.close();
      }
    }*/
    return customers;
  }

}
