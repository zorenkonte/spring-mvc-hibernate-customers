package com.dark.mode.demo.dao;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.repository.CustomerRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CustomerRepository {
    @Modifying
    @Query(value = "TRUNCATE TABLE `customer`", nativeQuery = true)
    void truncateTable();

    Iterable<Customer> findAllByOrderByLastName();
}
