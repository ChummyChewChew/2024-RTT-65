package org.leorodriguez.springinjectionautowiringexample.myServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneServices{
    //Creat an array of string
    private String [] data ={"Beware of the wolf in sheep's clothing",
    "Diligence is the mother of good luck", "The journey is the reward"};
    //Create a random number generator
    private Random rand = new Random();
    @Override
    public String getFortune() {
        //pick a random string
        int index = rand.nextInt(data.length);
        return data[index];
    }
}
