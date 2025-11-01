package ecom.ecom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void verifyWElcomepage() {
	  String title=driver.getTitle();
	  System.out.println("title of the webpage:"+title);
	  Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
	  driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	  driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	  
	  driver.findElement(By.name("Submit")).click();
	  String text=driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
	  System.out.println(text);
	  Assert.assertEquals(text, "Welcome selenium");
 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
