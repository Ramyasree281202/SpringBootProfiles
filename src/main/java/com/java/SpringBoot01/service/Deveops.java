package com.java.SpringBoot01.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("sit")
public class Deveops implements ICourseService {

	@Override
	public String getCourseDetails() {
		// TODO Auto-generated method stub
		return "Deveops Course";
	}

}
