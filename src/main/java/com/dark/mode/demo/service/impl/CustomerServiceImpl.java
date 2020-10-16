package com.dark.mode.demo.service.impl;

import com.dark.mode.demo.dao.CustomerDAO;
import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    @Override
    public Iterable<Customer> getAllCustomersOrderByLastName() {
        return customerDAO.findAllByOrderByLastName();
    }

    @Override
    public Customer save(Customer c) {
        return customerDAO.save(c);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerDAO.findById(id);
    }
}
