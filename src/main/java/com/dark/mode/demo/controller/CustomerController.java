package com.dark.mode.demo.controller;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import com.dark.mode.demo.util.Redirect;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    private Customer customer;

    @RequestMapping("/list")
    public String list(Model m) {
        m.addAttribute("customers", customerService.getAllCustomersOrderByLastName());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model m) {
        customer = new Customer();
        m.addAttribute(customer);
        return "add";
    }

    @RequestMapping("/{id}/update")
    public String update(@PathVariable Integer id, Model m) {
        customer = customerService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
        m.addAttribute(customer);
        return "update";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Customer c) {
        if (null != customer.getId()) {
            customer.setFirstName(c.getFirstName());
            customer.setLastName(c.getLastName());
            customer.setEmail(c.getEmail());
        } else {
            customer = c;
        }
        customer = customerService.save(customer);
        return getFormat(customer);
    }

    private String getFormat(Customer customer) {
        return String.format("%s#%s", Redirect.TO_CUSTOMER_LIST, customer.getId());
    }
}
