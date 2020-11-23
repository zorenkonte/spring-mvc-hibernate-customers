package com.dark.mode.demo.service.impl;

import com.dark.mode.demo.dao.CustomerDAO;
import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.UtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UtilityServiceImpl implements UtilityService {
    private final CustomerDAO customerDAO;

    @Override
    @Transactional
    public void truncateTable() {
        customerDAO.truncateTable();
    }

    public Iterable<Customer> populateTable(Iterable<Customer> customers) {
        return customerDAO.saveAll(customers);
    }
}
