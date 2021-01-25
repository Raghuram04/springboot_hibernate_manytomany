package com.weblearner.springboot;

import java.time.LocalDateTime;
import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weblearner.springboot.model.Product;
import com.weblearner.springboot.model.Customer;


@SpringBootApplication
public class Runner implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private ProductRepository productRepo;

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/// Many to Many

		Customer cust1 = new Customer("Sam", LocalDateTime.now());

		Product product1 = new Product("CORN", 100D);
		Product product2 = new Product("RICE", 200D);

		productRepo.saveAll(Arrays.asList(product1, product2));
		cust1.getProducts().addAll(Arrays.asList(product1, product2));

		customerRepo.save(cust1);

	}

}
