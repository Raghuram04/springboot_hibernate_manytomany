package com.weblearner.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.weblearner.springboot.model.Product;

@Component
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
