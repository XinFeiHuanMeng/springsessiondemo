package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {


    @GetMapping("/first")
    public String indexPage(Model model) {
        System.out.println("");
        System.out.println("hello");
        return "index";
    }

}