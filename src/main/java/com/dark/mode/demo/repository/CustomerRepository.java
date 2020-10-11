package com.dark.mode.demo.repository;

import com.dark.mode.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
