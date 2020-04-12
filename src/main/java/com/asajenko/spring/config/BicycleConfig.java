package com.asajenko.spring.config;

import com.asajenko.spring.model.Bicycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BicycleConfig {

    @Bean
    public Bicycle cannodnaleFsi() {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Cannodnale");
        bicycle.setModel("FSI");
        return bicycle;
    }

    @Bean("fsi2020")
    public Bicycle cannodnaleFsi2020() {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Cannodnale");
        bicycle.setModel("FSI 2020");
        return bicycle;
    }

    @Bean
    public Bicycle scalpel() {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Cannodnale");
        bicycle.setModel("Scalpel");
        return bicycle;
    }

    public void configSize() {
        System.out.println("We have config three bicycle");
    }
}
