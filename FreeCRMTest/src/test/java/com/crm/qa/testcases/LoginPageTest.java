package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Login;

public class LoginPageTest extends TestBase {
	Login loginpage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initilization();
		loginpage=new Login();
	}
	
	@Test(priority=1)
	public void loginpageTitletest(){
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
	@Test(priority=2)
	public void CRMlogoTest(){
		boolean flag=loginpage.validateCMRlogo();
		Assert.assertTrue(flag);
		}
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	
}
