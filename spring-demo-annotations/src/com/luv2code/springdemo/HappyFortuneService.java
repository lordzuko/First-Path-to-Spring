package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by hmaurya on 9/9/2016.
 */

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune(){
        return "Today is your lucky day!";
    }
}
