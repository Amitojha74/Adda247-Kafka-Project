package com.divya.kafka.consumer.controller;

import com.divya.kafka.consumer.dto.Customer;
import com.divya.kafka.consumer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;
    @GetMapping("/all")
    public List<Customer> getAll(){
       return customerRepo.findAll();
    }
}
