package com.example.jpajava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logon")
public class UserController {
    @RequestMapping("")
    public String logon() {
        return "admin/logon";
    }
}
