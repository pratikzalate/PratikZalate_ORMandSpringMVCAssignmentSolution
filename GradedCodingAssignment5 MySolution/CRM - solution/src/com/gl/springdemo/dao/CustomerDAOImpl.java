package com.gl.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create query
		Query<Customer> myQuery = 
				currentSession.createQuery("from Customer order by lastName",
											Customer.class);
		
		// execute query
		List<Customer> customersList = myQuery.getResultList();
				
		return customersList;
	}

	@Override
	public void saveCustomer(Customer customer) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		// save or update customer
		currentSession.saveOrUpdate(customer);
		
	}

	@Override
	public Customer getCustomer(int customerId) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		// read data from database using customerId
		Customer customer = currentSession.get(Customer.class, customerId);
		
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete customer object
		Query theQuery = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", customerId);
		
		theQuery.executeUpdate();
	}

}











