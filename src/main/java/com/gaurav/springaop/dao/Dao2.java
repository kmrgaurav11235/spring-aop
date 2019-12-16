package com.gaurav.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public Dao2() {
		// TODO Auto-generated constructor stub
	}
	
	public String retrieveSomething() {
		return "Dao Class name: Dao2";
	}

}
