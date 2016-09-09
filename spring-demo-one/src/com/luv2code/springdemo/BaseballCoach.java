package com.luv2code.springdemo;

/**
 * Created by hmaurya on 9/8/2016.
 */

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        // using our helper class viz. our dependency
        return "My BaseBall coach says " + fortuneService.getFortune();
    }

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
}
