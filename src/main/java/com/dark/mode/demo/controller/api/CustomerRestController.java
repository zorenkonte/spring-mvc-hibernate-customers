package com.dark.mode.demo.controller.api;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import com.dark.mode.demo.service.UtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.StreamSupport;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
@CrossOrigin(maxAge = 3600)
public class CustomerRestController {
    private final CustomerService customerService;
    private final UtilityService utilityService;
    private Customer customer;

    @GetMapping("/list")
    public Iterable<Customer> list() {
        return customerService.getAllCustomersOrderByLastName();
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer c) {
        return customerService.save(c);
    }

    @PatchMapping("/{id}/update")
    public Customer update(@PathVariable Integer id, @RequestBody Customer c) {
        findCustomer(id);
        fillCustomer(c);
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        findCustomer(id);
        customerService.deleteCustomerById(id);
        return ResponseEntity.ok(String.format("Customer with Id: %d deleted!", id));
    }

    @GetMapping("/list/truncate")
    public ResponseEntity<String> truncate() {
        utilityService.truncateTable();
        return ResponseEntity.ok("done");
    }

    @PostMapping("/list/populate")
    public ResponseEntity<String> populate(@RequestBody Iterable<Customer> customers) {
        var size = customerSize(customerService.getAllCustomers());
        if (size == 0) {
            var savedCustomers = utilityService.populateTable(customers);
            return ResponseEntity.ok(String.format("Added %d customers", customerSize(savedCustomers)));
        } else {
            return ResponseEntity.ok("Truncate table first");
        }
    }

    private void findCustomer(Integer id) {
        customer = customerService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
    }

    private void fillCustomer(Customer c) {
        customer.setFirstName(c.getFirstName());
        customer.setLastName(c.getLastName());
        customer.setEmail(c.getEmail());
    }

    private long customerSize(Iterable<Customer> customers) {
        return StreamSupport.stream(customers.spliterator(), false).count();
    }
}
