package com.curso.springframework.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello";
    @Override

    public String sayGreeting() {
        return HELLO;
    }
}
