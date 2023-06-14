package com.nucsaping;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class TrackCoach implements Coach{

    @PostConstruct
    void postConstruct() {
        System.out.println("production is running");
    }

    public TrackCoach() {
        System.out.println("Inside TrackCoach constructor. Profile prod is active");
    }

    @Override
    public String getFortune() {
        return "Today is my lucky day :)";
    }
}
