package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hmaurya on 9/8/2016.
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check to see if they are both the same bean
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object : "+result);
        System.out.println("\nMemory location for theCoach: "+theCoach);
        System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);

        context.close();
    }
}
