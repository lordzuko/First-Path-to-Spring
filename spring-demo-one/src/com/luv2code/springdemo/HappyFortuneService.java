package com.luv2code.springdemo;

/**
 * Created by hmaurya on 9/8/2016.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune(){
        return "today is your lucky day!";
    }
}
