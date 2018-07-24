package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;
import com.steadystate.css.dom.Property;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		try {
		prop=new Properties();
		
			FileInputStream fi=new FileInputStream("D:\\cafe_cbf\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
 public static void initilization(){
	 String Browsername=prop.getProperty("browser");
	 if(Browsername.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }else if(Browsername.equals("FF")){
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 
	 }
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.page_Load_TimeOut, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.page_implicit_TimeOut,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	 
 }
}
