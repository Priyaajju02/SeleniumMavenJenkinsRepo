package com.mphasis.demo.SeleniumJenkinsDemo;

import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
    private WebDriver driver;
    private String url;
    private String expectedTitle;
	
	@BeforeEach
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lakshmi Priya\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "http://www.google.com";
		expectedTitle = "Google";
		driver.navigate().to(url);
	}	
    @Test
    public void shouldTitleMatch()
    { 	
		String actualtitle = driver.getTitle();
		assertEquals(actualtitle, expectedTitle);
    }
    @AfterEach
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}
