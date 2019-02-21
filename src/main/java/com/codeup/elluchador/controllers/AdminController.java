package com.codeup.elluchador.controllers;

import com.codeup.elluchador.repositories.AdminRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {
    private final AdminRepository adminDao;

    public AdminController (AdminRepository adminDao) {
        this.adminDao = adminDao;
    }
    @GetMapping("/")
    public String homePage() {
        return "/partials";
    }
}
