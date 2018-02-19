package com.curso.springframework.didemo.controllers;

import com.curso.springframework.didemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
