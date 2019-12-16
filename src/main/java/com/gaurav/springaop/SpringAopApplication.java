package com.gaurav.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gaurav.springaop.business.Business1;
import com.gaurav.springaop.business.Business2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// This method will be called after the Spring context is ready
		log.info(business1.doSomething());
		log.info(business2.doSomething());
	}

}
