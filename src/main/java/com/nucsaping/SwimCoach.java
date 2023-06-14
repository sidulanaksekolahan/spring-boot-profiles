package com.nucsaping;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SwimCoach implements Coach {

    @PostConstruct
    void postConstruct() {
        System.out.println("development is running");
    }

    public SwimCoach() {
        System.out.println("Inside SwimCoach constructor. Profile dev is active");
    }

    @Override
    public String getFortune() {
        return "Swim 100 meters as a warm up";
    }
}
