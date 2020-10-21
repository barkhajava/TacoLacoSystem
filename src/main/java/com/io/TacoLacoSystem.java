package com.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TacoLacoSystem {

	public static void main(String[] args) {
		SpringApplication.run(TacoLacoSystem.class, args);
	}

}
