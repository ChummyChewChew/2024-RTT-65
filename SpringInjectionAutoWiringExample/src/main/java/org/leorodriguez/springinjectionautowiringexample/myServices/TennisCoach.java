package org.leorodriguez.springinjectionautowiringexample.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneServices fortuneServices;
    public TennisCoach(){
        //This is a default constructor
    }
    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }
    @Override
    public String getDailyFortune(){
        return fortuneServices.getFortune();
    }

}
