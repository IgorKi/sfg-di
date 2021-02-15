package com.Igor.Kiv.sgfdi.controllers;

import com.Igor.Kiv.sgfdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
