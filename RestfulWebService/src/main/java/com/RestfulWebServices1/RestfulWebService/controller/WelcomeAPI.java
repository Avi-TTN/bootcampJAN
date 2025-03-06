package com.RestfulWebServices1.RestfulWebService.controller;

import com.RestfulWebServices1.RestfulWebService.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeAPI {
    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/welcome")
    public String getWelcomeService(){
        return welcomeService.getMessage();
    }
}
