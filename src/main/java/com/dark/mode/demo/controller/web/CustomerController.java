package com.dark.mode.demo.controller.web;

import com.dark.mode.demo.model.Customer;
import com.dark.mode.demo.service.CustomerService;
import com.dark.mode.demo.util.Redirect;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @PostMapping("/save")
    public String save(@ModelAttribute Customer c) {
        customer = customerService.save(c);
        return getFormat(customer);
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Customer c) {
        fillCustomer(c);
        customerService.save(customer);
        return getFormat(customer);
    }

    @RequestMapping("/{id}/update")
    public String update(@PathVariable Integer id, Model m) {
        customer = customerService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
        m.addAttribute(customer);
        return "update";
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable Integer id) {
        customerService.deleteCustomerById(id);
        return Redirect.TO_CUSTOMER_LIST;
    }

    private void fillCustomer(Customer c) {
        customer.setFirstName(c.getFirstName());
        customer.setLastName(c.getLastName());
        customer.setEmail(c.getEmail());
    }

    private String getFormat(Customer c) {
        return String.format("%s#%s", Redirect.TO_CUSTOMER_LIST, c.getId());
    }
}
