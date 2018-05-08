package com.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"eng","default"})
public class PrimaryEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "This is default work banch-!";
    }
}
