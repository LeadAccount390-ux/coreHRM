package com.tests;

import org.testng.annotations.Test;

import com.Base.BasePage;
import com.pages.LoginPage;
import com.util.CommonUtils;
import com.util.TestNGUtils;

public class TestPIMPage extends BasePage {
	LoginPage loginPage=new LoginPage();
	
  @Test(description="verify that an employee can be added successfully")
  
  public void addemployeeThenVerify() throws Exception {
	  //login to the application using the loginPage method
	  loginPage.login();
	 // TestNGUtils.assertTrue(CommonUtils.getElementText(loginPage.getWelcomepage(),"Welcome selenium"));
	  
	  System.out.println("welcome Github");
	 
  }
}
	