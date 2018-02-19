package com.curso.springframework.didemo.controllers;

import com.curso.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;
    @Before
    private void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());

    }
}
