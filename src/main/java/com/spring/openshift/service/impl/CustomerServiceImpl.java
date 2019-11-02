/**
 * 
 */
package com.spring.openshift.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.openshift.entity.Customer;
import com.spring.openshift.repository.CustomerRepository;
import com.spring.openshift.service.CustomerService;

/**
 * The Class CustomerServiceImpl.
 *
 * @author avadheshkumar
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    /**
     * Gets the customers.
     *
     * @return the customers
     * @see com.spring.openshift.service.CustomerService#getCustomers()
     */
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    /**
     *
     * @param customer the customer
     * @return the customer
     * @see com.spring.openshift.service.CustomerService#createCustomer(com.spring.openshift.entity.Customer)
     */
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    

}
