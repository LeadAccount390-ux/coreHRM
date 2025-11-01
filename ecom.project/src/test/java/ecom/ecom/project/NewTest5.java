package ecom.ecom.project;

import org.testng.annotations.Test;

import seleniumjava.logintest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest5 {
	WebDriver driver;

		 @BeforeSuite
		 public void beforesuite()
		 {
			 System.out.println("connecting browser");
		 }
		  
				

	
		 @BeforeTest
		  public void beforeTest() {
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		  }
		 @BeforeClass
		  public void beforeClass() {
			 driver.findElement(By.name("txtUserName")).sendKeys("selenium");
				//identify the password and enter the password
						driver.findElement(By.name("txtPassword")).sendKeys("selenium");
						
			  }
		  

		
  public void f () {
  }
  @BeforeMethod
  public void beforeMethod() {
	//click on login
		driver.findElement(By.name("Submit")).click();
  }

  @AfterMethod
  public void afterMethod() {
		
	//  navigate the current URL
		driver.get("verifing manage");
  }

  @BeforeClass
  public void beforeClass() {
	//  navigate the current URL
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("verifying url");
  }

  @BeforeTest
  public void beforeTest() {
	  String title = driver.getTitle();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("verifying title");
  }


  @AfterSuite
  public void afterSuite() {
	  System.out.println("unable to connect OrangeHRM");
  }
	  public static void main(String[] args) {
			logintest login =new logintest();
			login.logintest();

	  }
	  }

