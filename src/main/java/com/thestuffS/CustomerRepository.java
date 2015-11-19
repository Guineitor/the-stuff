package com.thestuffS;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.BasicDBObject;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public BasicDBObject findByLastName(String lastName);

}