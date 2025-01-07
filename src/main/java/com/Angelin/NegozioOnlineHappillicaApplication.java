package com.Angelin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan(basePackages = {"com.Angelin.controller.OrdersController"})
public class NegozioOnlineHappillicaApplication {

    public static void main(String[] args) {

        SpringApplication.run(NegozioOnlineHappillicaApplication.class, args);
    }

}