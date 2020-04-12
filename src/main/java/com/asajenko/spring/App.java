package com.asajenko.spring;

import com.asajenko.spring.service.BicycleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.asajenko.spring");
        BicycleService bean = context.getBean(BicycleService.class);
        System.out.println(bean.getBicycleModels());
        bean.bicycleConfigSize();
    }
}
