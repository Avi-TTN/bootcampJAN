package com.assignment.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dev")
public class UserInformationService {
    @Autowired
    private UserInformation userInformation;

    public String getInformation (){
        return userInformation.getName();
    }
}
