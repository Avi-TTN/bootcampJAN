package com.RestfulWebServices1.RestfulWebService.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getMessage(){
        return "Welcome to Spring Boot";
    }


}
