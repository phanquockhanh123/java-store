package com.example.jpajava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/category")
public class CategoryController {
    @GetMapping("/list")
    public String index() {
        return "admin/category/index";
    }

    @GetMapping("/add")
    public String create() {
        return "admin/category/add";
    }
}
