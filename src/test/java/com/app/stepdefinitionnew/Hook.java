package com.app.stepdefinitionnew;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void teardown() {
		System.out.println("teardown");
	}
}
