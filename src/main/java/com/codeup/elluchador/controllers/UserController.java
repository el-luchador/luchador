package com.codeup.elluchador.controllers;

import com.codeup.elluchador.models.Admin;
import com.codeup.elluchador.models.User;
import com.codeup.elluchador.repositories.AdminRepository;
import com.codeup.elluchador.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final UserRepository userDao;
//    private final AdminRepository adminDao;

    public UserController (UserRepository userDao) {
        this.userDao = userDao;
//        this.adminDao = adminDao;
    }
    @GetMapping("/")
    public String homePage() {
        return "system/landing";
    }
}
