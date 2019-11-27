package com.inetbanking.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		logger.info("URL has been entered successfully");
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.setUsername(username);
		logger.info("User enters user name");
		
		loginpage.setPassword(password);
		logger.info("User enters password");
		
		loginpage.clickSubmit();
		logger.info("User clicks on login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test case PASSED");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test case FAILED");
		}
	}

}
