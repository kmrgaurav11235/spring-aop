package com.gaurav.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gaurav.springaop.dao.Dao1;

@Component
public class Business1 {
	
	@Autowired
	private Dao1 dao;

	public Business1() {
		// TODO Auto-generated constructor stub
	}
	
	public String doSomething() {
		return dao.retrieveSomething();
	}

}
