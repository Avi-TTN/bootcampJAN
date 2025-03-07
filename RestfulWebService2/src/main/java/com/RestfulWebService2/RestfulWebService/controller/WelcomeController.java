package com.RestfulWebService2.RestfulWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Objects;

@RestController
public class WelcomeController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/welcome")
    public String welcomeInternationalized(@RequestParam (required = false) String code, @RequestParam String userName){
        Locale locale = (code == null) ? (Locale.ENGLISH) : (Locale.of(code));
        Object[] arr = {userName};
        return messageSource.getMessage("message.welcome", arr, locale);
    }
}
