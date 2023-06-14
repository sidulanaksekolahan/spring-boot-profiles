package com.nucsaping;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SwimCoach implements Coach {

    @Value("${team.address}")
    private String teamAddress;

    @PostConstruct
    void postConstruct() {
        System.out.println("development is running");
        System.out.println("Address is: " + teamAddress);
    }

    public SwimCoach() {
        System.out.println("Inside SwimCoach constructor. Profile dev is active");
    }

    @Override
    public String getFortune() {
        return "Swim 100 meters as a warm up";
    }
}
