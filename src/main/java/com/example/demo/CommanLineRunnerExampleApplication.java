package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.CMDService;

@SpringBootApplication
public class CommanLineRunnerExampleApplication implements CommandLineRunner{
	
	@Autowired
	private CMDService service;

	public static void main(String[] args) {
		//SpringApplication.run(CommanLineRunnerExampleApplication.class, args);
		System.out.println("Main Method");
		SpringApplication app = new SpringApplication(CommanLineRunnerExampleApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Override Run Method");
		if(args.length >0) {
			System.out.println(service.getNameConfig(args[0]));
		} else {
			System.out.println(service.getNameConfig());
		}
		//System.exit(0);
	}

}
