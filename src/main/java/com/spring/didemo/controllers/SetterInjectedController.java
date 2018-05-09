package com.spring.didemo.controllers;

import com.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
