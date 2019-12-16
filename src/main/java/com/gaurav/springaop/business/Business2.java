package com.gaurav.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gaurav.springaop.dao.Dao2;

@Component
public class Business2 {
	
	@Autowired
	private Dao2 dao;

	public Business2() {
		// TODO Auto-generated constructor stub
	}
	
	public String doSomething() {
		return dao.retrieveSomething();
	}

}
