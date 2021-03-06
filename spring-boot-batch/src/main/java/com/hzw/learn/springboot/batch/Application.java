package com.hzw.learn.springboot.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableBatchProcessing
@ComponentScan(basePackages = { "com.hzw.learn.springboot" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
