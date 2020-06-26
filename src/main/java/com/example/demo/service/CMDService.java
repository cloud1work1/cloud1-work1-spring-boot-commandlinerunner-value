package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CMDService {

	@Value("${name:unknown}")
	private String nameConfig;
	
	public String getNameConfig() {
		return getNameConfig(nameConfig);
	}
	
	public String getNameConfig(String name) {
		return " Hello " + name;
	}
}
