package com.gaurav.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public Dao1() {
		// TODO Auto-generated constructor stub
	}
	
	public String retrieveSomething() {
		return "Dao Class name: Dao1";
	}

}
