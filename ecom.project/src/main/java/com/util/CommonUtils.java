package com.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonUtils {
	
	public static Properties config;
	public static WebDriver driver;
	public static FileInputStream fis;
	public static void readPropertiesFile()
	{
		try {
			FileInputStream fis = new FileInputStream("D.\\software tester classes\\eclipse pratice files\\selenium\\pageobjectmodel");
			config = new Properties();
			config.load(fis);
		}
		catch(Exception e)
		{
				
		}
		
	}

	public static void LaunchBrowserAndNavigateToApp()
	{
			String browserName=config.getProperty("browser");
			try {
				
			if(browserName.equals("chrome"))
			{
				driver = new FirefoxDriver();
			}

			else if(browserName.equalsIgnoreCase("chrome"))
			{
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
			
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				 driver = new FirefoxDriver();
				 driver.manage().window().maximize();
			}
			else {
				System.out.println("unable to launch the browser");
			}
			driver.get(config.getProperty("Url"));
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		public static WebElement findElement(By by)
		{
			WebElement element=null;
			try {
				element = driver.findElement(by);			
				}catch(Exception e) {
					TestNGUtils.assertfail(e.getMessage());
				}
			return element;
		
		}
	        public static void clearWholeText(By by)
		{
			try
			{
				//identify the Username and clearWholeText
				driver.findElement(by).clear();
			}
			catch(Exception e) {
				TestNGUtils.assertfail(e.getMessage());
			}
			}

		public static void enterValue(By by,String value,boolean eClear)
		{
			try
			{
				if(eClear)//eclear is return them enter value method in boolean value is true
			
					clearWholeText(by);//call them clear wholeText method
				driver.findElement(by).sendKeys(value);
			}
			catch(Exception e)
			{
				TestNGUtils.assertfail(e.getMessage());
			}
		}
			
		public static void clickElement(By by)
		{
		try
		{
			findElement(by).click();
		}catch(Exception e) {
			TestNGUtils.assertfail(e.getMessage());
		}
		}
		public static String getElementText(By by)
		{
			String elementText=null;
			try {
				elementText=findElement(by).getText();
			}
			catch(Exception e)
			{
				TestNGUtils.assertfail(e.getMessage());
			}
			return elementText;
		}

	

}
		

