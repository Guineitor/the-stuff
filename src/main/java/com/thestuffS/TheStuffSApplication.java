package com.thestuffS;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.thestuffS.*;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class TheStuffSApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	
    public static void main(String[] args) {
        SpringApplication.run(TheStuffSApplication.class, args);
    }
    
	public void run(String... args) throws Exception {

		
		//repository.deleteAll();
		// save a couple of customers
//		for (int i = 0; i < 10; i++) {
//			repository.save(new Customer("Alice", "Smith"));
//			repository.save(new Customer("Bob", "Smith"));
//		}
		
		
		
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}

	}
}


@RestController
class GreetingController   {
	@Autowired
	private CustomerRepository repository;
    @RequestMapping("/service/mongo/save")
    String save() {
    	repository.save(new Customer("Alice", "Smith"));
    	return "ok";
    }
    @RequestMapping("/service/mongo/find")
    Customer find() {

    	return repository.findByFirstName("Alice");
    	
    }
} 




