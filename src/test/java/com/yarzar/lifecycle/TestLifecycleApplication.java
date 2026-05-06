package com.yarzar.lifecycle;

import org.springframework.boot.SpringApplication;

public class TestLifecycleApplication {

	public static void main(String[] args) {
		SpringApplication.from(LifecycleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
