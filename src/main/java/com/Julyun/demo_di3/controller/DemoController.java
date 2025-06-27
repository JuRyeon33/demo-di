package com.Julyun.demo_di3.controller;

import com.Julyun.demo_di3.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    public void handleRequest() {
        demoService.doSomething();
    }
}
