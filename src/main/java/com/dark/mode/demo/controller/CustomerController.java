package com.dark.mode.demo.controller;

import com.dark.mode.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "index";
    }
}
