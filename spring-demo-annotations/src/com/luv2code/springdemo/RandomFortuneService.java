package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hmaurya on 9/9/2016.
 */

@Component
public class RandomFortuneService implements FortuneService {

    private List<String> fortune;

    public RandomFortuneService(){
        fortune = new ArrayList<String>() {{
           add("Today is your lucky day");
           add("Rise and shine baby");
           add("Live Like this is your last day");
        }};
    }

    @Override
    public String getFortune() {
        int rand = new Random().nextInt()%3;
        return fortune.get(Math.abs(rand));
    }
}
