package com.java.SpringBoot01;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		
	}

}
