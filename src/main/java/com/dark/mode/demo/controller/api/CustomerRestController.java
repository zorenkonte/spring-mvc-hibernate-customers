package com.dark.mode.demo.controller.api;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerRestController {
    private final CustomerService customerService;
    private Customer customer;

    @RequestMapping("/list")
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
        return ResponseEntity.ok(String.format("Customer with Id: %s deleted!", id));
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
}
