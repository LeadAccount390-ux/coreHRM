package ecom.ecom.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest4 {
	WebDriver driver;
  @Test
  public void verifyWelcome() {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
  }
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("connecting to database");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("unable to connect database");
  }

}
