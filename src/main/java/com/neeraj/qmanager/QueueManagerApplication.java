package com.neeraj.qmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.neeraj.qmanager")
public class QueueManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueManagerApplication.class, args);
	}

}
