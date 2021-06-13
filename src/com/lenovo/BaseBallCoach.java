package com.lenovo;


import org.springframework.beans.factory.annotation.Value;

public class BaseBallCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice BaseBall fro 30 Minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }


}
