package com.curso.springframework.didemo.controllers;

import com.curso.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        return greetingService.sayGreeting();
    }
}
