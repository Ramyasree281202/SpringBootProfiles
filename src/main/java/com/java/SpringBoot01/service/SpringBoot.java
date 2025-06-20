package com.java.SpringBoot01.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("sb")
@Profile("prod")
public class SpringBoot implements ICourseService {
	public String getCourseDetails() {
		return "Spring Boot Course";
	}
}
