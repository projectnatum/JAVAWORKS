package com.natum.registration.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.natum.registration.entity.Customer;
import com.natum.registration.model.CustomerModel;
import com.natum.registration.model.Passwords;

@Service
public class RegistrationDAOImp implements RegistrationDAOInterface {
	private static Logger logger = Logger.getLogger(RegistrationDAOImp.class);
	
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Customer saveCustomers(Customer customer) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(customer);
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		
		return customer;
		// return registrationDAO.save(customer);

	}

	@Override
	public Customer convertCustomerModelToEntity(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		
		logger.info("Entry: convertCustomerModelToEntity"+customerModel);
		
		Customer customer = new Customer();
	//	Passwords passwords=new Passwords();
		customer.setCustDOB(customerModel.getCustDOB());
		customer.setCustEmail(customerModel.getCustEmail());
		customer.setCustFirstName(customerModel.getCustFirstName());
		customer.setCustLastName(customerModel.getCustLastName());
		customer.setCustSSN(customerModel.getCustSSN());
		customer.setCustZip(customerModel.getCustZip());
		customer.setCustPassword(customerModel.getPasswords().getCustPassword());
		logger.info("Exit: convertCustomerModelToEntity"+customerModel);
		return customer;
	}

	@Override
	public CustomerModel convertEntityToCustomerModel(Customer customer) {
		// TODO Auto-generated method stub
		logger.info("Entry: convertEntityToCusomterModel"+customer);
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCustDOB(customer.getCustDOB());
		customerModel.setCustEmail(customer.getCustEmail());
		customerModel.setCustFirstName(customer.getCustFirstName());
		customerModel.setCustId(customer.getCustId());
		customerModel.setCustLastName(customer.getCustLastName());
		customerModel.setCustSSN(customer.getCustSSN());
		customerModel.setCustZip(customer.getCustZip());
		Passwords passwords=new Passwords();
		passwords.setCustPassword(customer.getCustPassword());
		customerModel.setPasswords(passwords);
		
		//customerModel.setCustPassword(customer.getCustPassword());
		logger.info("Exit: convertEntityToCusomterModel"+customer);
		return customerModel;
	} 

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		logger.debug("Entry: RegistrationServiceImp, getAllCustomers()");
		List<Customer> customers = new ArrayList<Customer>();
		Query query = null;
		try {

			Session session = sessionFactory.getCurrentSession();
			query = session.createQuery("from customers order by cust_Id");
			customers = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// finally
		// {
		// if(session != null){
		// session.close();
		// }
		// }
		logger.debug("Exit: RegistrationServiceImp, getAllCustomers()");
		return customers;
	}

}
