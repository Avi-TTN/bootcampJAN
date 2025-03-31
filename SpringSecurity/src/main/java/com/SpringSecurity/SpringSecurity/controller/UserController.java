package com.SpringSecurity.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/public")
    public String publicApi() {
        return "This is a public endpoint";
    }

    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ADMIN')")
    public String adminApi() {
        return "This is an admin-only endpoint";
    }

    @GetMapping("/user")
//    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String userApi() {
        return "This is accessible by both users and admins";
    }
}

