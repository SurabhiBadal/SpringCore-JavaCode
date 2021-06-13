package com.lenovo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class JavaCodeDemoApp {
    public static void main(String[] args) {

        // load the config file
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

        //Retrieve bean from spring container
        Coach theCoach=context.getBean("baseBallCoach",Coach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
