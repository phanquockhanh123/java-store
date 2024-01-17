package com.example.jpajava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    @RequestMapping("")
    public String home() {
        return "home";
    }

    @RequestMapping("/about-us")
    public String aboutUs() {
        return "layout-fe/about-us";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "layout-fe/blog";
    }

    @RequestMapping("/wishlist")
    public String wishlist() {
        return "layout-fe/wishlist";
    }

    @RequestMapping("/cart")
    public String cart() {
        return "layout-fe/cart";
    }

    @RequestMapping("/checkout")
    public String checkout() {
        return "layout-fe/checkout";
    }
}
