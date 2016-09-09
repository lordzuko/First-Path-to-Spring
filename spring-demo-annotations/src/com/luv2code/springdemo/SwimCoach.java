package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by hmaurya on 9/9/2016.
 */
public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    public String getEmail() {
        return email;
    }

    @Override

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
