package com.weblearner.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.weblearner.springboot.model.Customer;

@Component
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
