package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Login extends TestBase  {
	
	//PageFactory or Object Repository:
	
@FindBy(name="username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//div[@class='input-group-btn']/input")
WebElement lgnbtn;

@FindBy(xpath="//button[contains(text(),'Sign Up']")
WebElement signUpbtn;

@FindBy(xpath="//img[(@class='img-responsive')]")
WebElement CMRlogo;

//Initiliaze the object repository/Page objects
//constructor
public Login()
{
PageFactory.initElements(driver, this);

}
//Actions or Different features
public String validateLoginPageTitle(){
	return driver.getTitle();
}

public boolean validateCMRlogo(){
	return CMRlogo.isDisplayed();
}

public HomePage login(String uid,String pwd) throws InterruptedException
{
	username.sendKeys(uid);
	password.sendKeys(pwd);
	Thread.sleep(2000);
	lgnbtn.click();
	return new HomePage();
}



}
