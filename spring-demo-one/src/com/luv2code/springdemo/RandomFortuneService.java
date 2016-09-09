package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hmaurya on 9/8/2016.
 */
public class RandomFortuneService implements FortuneService {


    private List<String> fortunes;

    public RandomFortuneService(){
        fortunes = new ArrayList<String>() {{
            add("Your day will suck today");
            add("Today is your lucky day");
            add("Get you butt moving");
        }};
    }

    @Override
    public String getFortune() {

        int rand = new Random().nextInt()%3;
        return fortunes.get(Math.abs(rand));
    }
}
