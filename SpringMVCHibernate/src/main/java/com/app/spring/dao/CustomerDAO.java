package com.app.spring.dao;

import java.util.List;

import com.app.spring.model.Customer;

public interface CustomerDAO {
	 
    public void addCustomer(Customer p);
 
    public void updateCustomer(Customer p);
 
    public List<Customer> listCustomers();
 
    public Customer getCustomerById(int id);
 
    public void removeCustomer(int id);
}