package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hmaurya on 9/8/2016.
 */
public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
