package ecom.ecom.project;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver;
	Properties config;
	Properties OR;
  @Test
  public void verifyWelcompage() {
                 driver.get(config.getProperty("Url"));
	  
	  String  title = driver.getTitle();//OrangeHRM - New Level of HR Management
		 
		 System.out.println("Title of the webpage:" +title);
		 Assert.assertEquals(title,"OrangeHRM - New Level of HR Management");
		 
    driver.findElement(By.xpath(OR.getProperty("Login_userID"))).sendKeys("selenium");
    driver.findElement(By.xpath(OR.getProperty("Login_password"))).sendKeys("selenium");
	 driver.findElement( By.name("Submit")).click();
		 
		String text = driver.findElement(By.xpath(OR.getProperty("Welcome_selenium"))).getText();
		System.out.println(text);
		
		 Assert.assertEquals(text, "Welcome selenium");
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	//access the config.properties file into working environment
	  FileInputStream fis= new FileInputStream("C:\\Users\\Hp\\Downloads\\selenium software dump\\eclipse (1)\\eclipse\\hrms\\ecom.project\\src\\main\\java\\config.properties");
  //create memory space for the config.properties file
	  config =new Properties();
	  //store config.properties file into memory space
	  config.load(fis);
	  
	//access the OR.properties file into working environment
	  FileInputStream fis1= new FileInputStream("C:\\Users\\Hp\\Downloads\\selenium software dump\\eclipse (1)\\eclipse\\hrms\\ecom.project\\src\\main\\java\\OR.properties");
	  //create memory space for the config.properties file
	   OR =new Properties();
	  //store config.properties file into memory space
	  OR.load(fis1);
	  
	  if(config.getProperty("browserName").equals("Firefox"))
	  {
		  driver=new FirefoxDriver();
		
	  }else {
	  
		  System.out.println("unable to launch browser");
		  
			}
	  driver.get(config.getProperty("Url"));
  }
  

  @AfterClass
  public void afterClass() {
	  driver.findElement(By.xpath(OR.getProperty("Logout_button"))).click();
	  driver.close();
		
  }

}
