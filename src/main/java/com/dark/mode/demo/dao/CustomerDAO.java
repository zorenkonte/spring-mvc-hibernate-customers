package com.dark.mode.demo.dao;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CustomerRepository {
    Iterable<Customer> findAllByOrderByLastName();
}
