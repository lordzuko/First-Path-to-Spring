package com.luv2code.springdemo;

/**
 * Created by hmaurya on 9/9/2016.
 */
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
