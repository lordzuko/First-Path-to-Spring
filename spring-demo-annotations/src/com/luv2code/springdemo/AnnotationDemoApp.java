package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hmaurya on 9/9/2016.
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {


        // read spring config file
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");*/
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        // close the context
        context.close();
    }
}
