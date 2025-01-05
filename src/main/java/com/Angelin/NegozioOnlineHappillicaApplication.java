package com.Angelin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@AutoConfigurationPackage
public class NegozioOnlineHappillicaApplication {

    public static void main(String[] args) {

        SpringApplication.run(NegozioOnlineHappillicaApplication.class, args);
    }

}