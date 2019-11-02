package com.spring.openshift.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.openshift.entity.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    public List<Customer> findAll();

}
