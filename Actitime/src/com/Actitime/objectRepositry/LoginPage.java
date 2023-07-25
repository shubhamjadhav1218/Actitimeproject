package com.Actitime.objectRepositry;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(id="username")
	private WebDriver untbx;
	
	@FindBy(name="pwd")
	private WebDriver pwbx;
	
	@FindBy(xpath = "//div[.='Login'")
	private WebDriver lgbtx;

	
	//intitilization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

//utilization
	public WebDriver getUntbx() {
		return untbx;
	}


	public WebDriver getPwbx() {
		return pwbx;
	}


	public WebDriver getLgbtx() {
		return lgbtx;
	}
	
	
}
