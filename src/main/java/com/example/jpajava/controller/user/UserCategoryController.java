package com.example.jpajava.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class UserCategoryController {
    @RequestMapping("/list")
    public String index() {
        return "layout-fe/category";
    }
}
