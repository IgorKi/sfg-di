package com.Igor.Kiv.sgfdi.controllers;

import com.Igor.Kiv.sgfdi.services.GreetingService;

public class ConstructorInjectedController {

   protected final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
