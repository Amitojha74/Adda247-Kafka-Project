package com.divya.kafka.consumer.repo;

import com.divya.kafka.consumer.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
