package com.example.shoeshop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeController {
    @GetMapping("/")
    public String show()
    {
        return "layouts/layout";
    }

    @GetMapping("/index")
    public String index()
    {
        return "home/index";
    }
}

