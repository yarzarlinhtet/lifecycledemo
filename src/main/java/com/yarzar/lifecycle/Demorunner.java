package com.yarzar.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Demorunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">> DEMO RUNNER");

        try {
            this.userService.createUser();
        } catch (Exception e) {
            System.out.println(">> EXCEPTION OCCURRED");
        }
    }
}
