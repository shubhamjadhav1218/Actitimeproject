package com.Actitime.Genericlibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public WebDriver driver;
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected",true);
}
@BeforeClass
public void launchBrowser() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	filelibrary f=new filelibrary();
	
	driver.get("https://demo.actitime.com/login.do");
	Reporter.log("Browser is launched successfully",true);
}
@BeforeMethod
public void login() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login'")).click();
	Reporter.log("login succesfull",true);
}
@AfterMethod
public void logoutToActitime() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logged out successfully",true);
}
@AfterClass
public void closetheBrowser() {
	driver.close();
	Reporter.log("browser is closed",true);

}
@BeforeSuite
public void databasedisdisconnection() {
	Reporter.log("data base is disconnected",true);
}
}
