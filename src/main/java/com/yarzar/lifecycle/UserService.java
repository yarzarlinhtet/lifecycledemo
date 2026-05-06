package com.yarzar.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        System.out.println(">> INIT USER SERVICE");
    }

    @Transactional
    public void createUser() {

        System.out.println(">> CREATE USER");

        UserEntity userEntity = new UserEntity();
        userEntity.setName("John Doe");

        this.userRepository.save(userEntity);

        System.out.println(">> CREATE USER SUCCESS");

        if(true) {
            throw new RuntimeException();
        }

    }

    public void selfInvoke() {
        System.out.println(">> SELENE USER SERVICE");
        this.createUser();
    }

    @PreDestroy
    public void destroy() {
        System.out.println(">> DESTROY USER SERVICE");
    }
}
