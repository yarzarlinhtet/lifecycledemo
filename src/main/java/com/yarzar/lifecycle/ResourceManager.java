package com.yarzar.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ResourceManager {
    @PostConstruct
    public void init() {
        System.out.println(">> OPEN RESOURCE");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(">> CLOSE RESOURCE");
    }
}
