package com.lenovo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
class SportConfig {
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public Coach baseBallCoach(){
        BaseBallCoach baseBallCoach=new BaseBallCoach(happyFortuneService());
        return baseBallCoach;
    }

}
