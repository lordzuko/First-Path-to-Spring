package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by hmaurya on 9/9/2016.
 */

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    //Field Injection
    //@Autowired
    private FortuneService fortuneService;

    // setter injection
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> Tennis Coach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    // constructor injection
    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @PostConstruct
    public void doSetup(){
        System.out.println("In post Construct");
    }

    @PreDestroy
    public void doCleanUp(){
        System.out.println("In pre destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "Tennis Coach says : "+fortuneService.getFortune();
    }
}
