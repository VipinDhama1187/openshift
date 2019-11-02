/**
 * 
 */
package com.spring.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.openshift.entity.Customer;
import com.spring.openshift.service.CustomerService;

/**
 * @author avadheshkumar
 *
 */
@RestController
public class OpenshiftController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to springg boot openshift!!";
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    
    
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Customer createCustomers(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
}
