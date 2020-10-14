package com.dark.mode.demo.service;

import com.dark.mode.demo.model.Customer;

public interface CustomerService {
    Iterable<Customer> getAllCustomers();
    Iterable<Customer> getAllCustomersOrderByLastName();
    Customer save(Customer c);
}
