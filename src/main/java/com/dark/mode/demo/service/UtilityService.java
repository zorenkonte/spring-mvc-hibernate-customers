package com.dark.mode.demo.service;

import com.dark.mode.demo.model.Customer;

public interface UtilityService {
    void truncateTable();

    Iterable<Customer> populateTable(Iterable<Customer> customers);
}
