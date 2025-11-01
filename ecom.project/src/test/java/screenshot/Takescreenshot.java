package screenshot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {
	WebDriver driver;
	void logintest()   throws IOException
	{
		try {
			//open the browser
			 driver =new FirefoxDriver();
			
			//maximize the window
			driver.manage().window().maximize();
			
		//navigate the current URL
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			
		//get the title
			String title = driver.getTitle();
			
		//print the title of webpage
			System.out.println("title of the webpage:"+title);
			 //verification
			if(title.equals("OrangeHRM - New Level of HR Management"))
			{
				System.out.println(" title verified successfully");
			}
			else
			{
				System.out.println(" title not verified sucessfully");
			}
			
			//identify the username and enter the user
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");
			
			//identify the password and enter the password
					driver.findElement(By.name("txtPassword")).sendKeys("elenium");
					
	         //click on login
					driver.findElement(By.name("Submit")).click();
					
			
			//identify and get the welcome selenium page
			String Text=driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
			System.out.println(Text);
			
			
			
			
			//click logout button
			driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
			//close the browser
			driver.close();
		} 
		catch(Exception e)
		{
			File desired_location=new File("C:\\Users\\Hp\\OneDrive\\Documents\\Failure.png");
			File copy_screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(copy_screenshot, desired_location );
			System.out.println("Take Screenshot");
		}
	}
		public static void main(String[] args)  throws IOException {
			Takescreenshot login =new Takescreenshot();
			login.logintest();
		}
}
