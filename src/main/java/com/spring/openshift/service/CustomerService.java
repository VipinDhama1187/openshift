/**
 * 
 */
package com.spring.openshift.service;

import java.util.List;

import com.spring.openshift.entity.Customer;

/**
 * @author avadheshkumar
 *
 */
public interface CustomerService {

    public List<Customer> getCustomers();
    
    public Customer createCustomer(Customer customer);
}
