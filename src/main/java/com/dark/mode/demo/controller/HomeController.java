package com.dark.mode.demo.controller;

import com.dark.mode.demo.util.Redirect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return Redirect.TO_CUSTOMER_LIST;
    }
}
