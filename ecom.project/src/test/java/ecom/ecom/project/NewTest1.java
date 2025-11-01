package ecom.ecom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void  verifyWelcomepage() 
  {
	  
	  String title= driver.getTitle();
	  
	  System.out.println("title of the webpage:" +title);
	  Assert.assertEquals(title,"Kosmik Hospital Management System");
	  
		driver.findElement(By.name("username")).sendKeys("kosmik");
		
		driver.findElement(By.name("password")).sendKeys("kosmik");

		driver.findElement(By.name("submit")).click();
  }
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/master.php");
	  
	
  }

  @AfterClass
  public void afterClass() {
	  driver.findElement(By.xpath("/html/body/div[2]/div/h3/a")).click();
	  driver.close();
	  
	 
  }

}
