package com.codeup.elluchador.controllers;

import com.codeup.elluchador.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminRepository adminDao;

    @GetMapping("/")
    public String homePage() {
        return "/landing";
    }

    @GetMapping("/home")
    public String sitePage() { return "/site-content"; }
}
