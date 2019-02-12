package com.codeup.elluchador.controllers;

import com.codeup.elluchador.repositories.AdminRepository;
import com.codeup.elluchador.repositories.UserRepository;

public class AdminController {
    private final UserRepository userDao;
    private final AdminRepository adminDao;

    public AdminController (UserRepository userDao, AdminRepository adminDao) {
        this.userDao = userDao;
        this.adminDao = adminDao;
    }

}
