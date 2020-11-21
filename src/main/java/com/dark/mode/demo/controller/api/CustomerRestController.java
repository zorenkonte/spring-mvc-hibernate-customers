package com.dark.mode.demo.controller.api;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import com.dark.mode.demo.service.UtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(String.format("Customer with Id: %s deleted!", id));
    }

    @GetMapping("/list/truncate")
    public ResponseEntity<String> reset() {
        utilityService.truncateTable();
        return ResponseEntity.ok("done");
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
