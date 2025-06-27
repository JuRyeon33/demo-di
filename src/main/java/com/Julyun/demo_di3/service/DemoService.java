package com.Julyun.demo_di3.service;

import com.Julyun.demo_di3.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }


    public void doSomething() {
        demoRepository.save();
    }
}