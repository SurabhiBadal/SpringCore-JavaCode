package com.lenovo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class JavaCodeDemoApp {
    public static void main(String[] args) {

        // load the config file
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

        //Retrieve bean from spring container
       BaseBallCoach theCoach=context.getBean("baseBallCoach",BaseBallCoach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        context.close();

    }
}
