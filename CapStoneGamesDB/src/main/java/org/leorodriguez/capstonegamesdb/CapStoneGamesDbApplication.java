package org.leorodriguez.capstonegamesdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"org.leorodriguez.capstonegamesdb"})
public class CapStoneGamesDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapStoneGamesDbApplication.class, args);
    }

}
