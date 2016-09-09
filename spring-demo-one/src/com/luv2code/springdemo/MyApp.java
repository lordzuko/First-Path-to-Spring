package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hmaurya on 9/8/2016.
 */
public class MyApp {
    public static void main(String[] args) {

        // load the spring configuration file
        // ApplicationContext is the Spring Container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        //Coach theCoach = context.getBean("myCoach",Coach.class); // here the second parameter is interface
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class); // here the second parameter is interface

        // call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our method for fortunes
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
