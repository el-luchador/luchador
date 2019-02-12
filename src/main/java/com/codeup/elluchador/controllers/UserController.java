package com.codeup.elluchador.controllers;

import com.codeup.elluchador.models.Admin;
import com.codeup.elluchador.models.User;
import com.codeup.elluchador.repositories.AdminRepository;
import com.codeup.elluchador.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private User user;
    private UserRepository userDao;
    private Admin admin;
    private AdminRepository adminDao;

    public UserController (User user, UserRepository userDao, Admin admin, AdminRepository adminDao) {
        this.user = user;
        this.userDao = userDao;
        this.admin = admin;
        this.adminDao = adminDao;
    }
    @GetMapping("/")
    public String homePage() {
        return "system/landing";
    }
}
