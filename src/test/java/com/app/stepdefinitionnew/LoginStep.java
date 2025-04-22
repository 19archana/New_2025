package com.app.stepdefinitionnew;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginStep {
	
	@Given("launch url")
	public void launch_url() {
	    System.out.println("launch url");
	}
	@When("Enter username {string}")
	public void enter_username(String user) {
		System.out.println(user);
	}
	    
	@When("Enter password {string}")
	public void enter_password(String pass) {
	    System.out.println(pass);
	}
	@When("click login button")
	public void click_login_button() {
	  System.out.println("login button");
	}
	@Then("Navigate to next page")
	public void navigate_to_next_page() {
		
		System.out.println("validate home page");
	   
	}
	@When("Enter user {string}")
	public void enter_user(String data) {
	    System.out.println(data);
	}
	@When("Enter pass {string}")
	public void enter_pass(String data) {
	  System.out.println(data);
	}
	@When("Enter userone {string}")
	public void enter_userone(String user2) {
	    System.out.println(user2);
	}
	@When("Enter passone   {string}")
	public void enter_passone(String pass2) {
	    System.out.println(pass2);
	}
	@Then("Validate Homepage")
	public void validate_homepage() {
	    System.out.println("navigate homepage");
	}
	
	@When("Enter the values for given form")
	public void enter_the_values_for_given_form(DataTable dataTable) {
	    List<String> list= dataTable.asList();
	    System.out.println(list.get(1));
	}
	@When("Enter the data for given form")
	public void enter_the_data_for_given_form(DataTable dataTable) {
	   Map<String,String> map = dataTable.asMap();
	   
	   System.out.println(map.get("Lastname"));
	   Assert.assertTrue(false);
	}

}
