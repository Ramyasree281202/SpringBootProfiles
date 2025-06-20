package com.java.SpringBoot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.java.SpringBoot01.service.ICourseService;
@Configuration
public class ServiceImplement implements CommandLineRunner{
	@Autowired
	private ICourseService course;
	
	public void run(String ...args) {
		System.out.println(course.getCourseDetails());
	}
}
