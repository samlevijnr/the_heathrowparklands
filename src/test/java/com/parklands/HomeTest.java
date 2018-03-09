package com.parklands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeTest {

	private WebDriver driver;
	private String url = "http://www.heathrow.com/";
	
	@BeforeClass()
	public void initiate(){
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/gecko19/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test()
	public void pLn(){
		driver.get(url);
		System.out.println("I have just been printed");
	}
	
	@AfterTest()
	public void tearDown() throws InterruptedException{
		Thread.sleep(10000);
		driver.close();
	}
}
