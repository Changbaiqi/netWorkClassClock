package com.simbot.simbottest;


import love.forte.simboot.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class SimBotTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimBotTestApplication.class, args);
    }

}
