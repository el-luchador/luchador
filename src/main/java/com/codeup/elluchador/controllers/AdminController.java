package com.codeup.elluchador.controllers;

import com.codeup.elluchador.repositories.AdminRepository;
import com.codeup.elluchador.repositories.UserRepository;
//import com.codeup.elluchador.repositories.UserRepository;

public class AdminController {
    private UserRepository userDao;
    private final AdminRepository adminDao;

    public AdminController (AdminRepository adminDao) {
//        this.userDao = userDao;
        this.adminDao = adminDao;
    }
}
