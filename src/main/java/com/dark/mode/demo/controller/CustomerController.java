package com.dark.mode.demo.controller;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import com.dark.mode.demo.util.Redirect;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @RequestMapping("/list")
    public String list(Model m) {
        m.addAttribute("customers", customerService.getAllCustomersOrderByLastName());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model m) {
        Customer customer = new Customer();
        m.addAttribute(customer);
        return "add";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute Customer c) {
        var customer = customerService.save(c);
        return String.format("%s#%s", Redirect.TO_CUSTOMER_LIST, customer.getId());
    }
}
