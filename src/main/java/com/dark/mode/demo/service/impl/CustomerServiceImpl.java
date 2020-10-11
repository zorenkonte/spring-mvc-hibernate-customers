package com.dark.mode.demo.service.impl;

import com.dark.mode.demo.dao.CustomerDAO;
import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }
}
