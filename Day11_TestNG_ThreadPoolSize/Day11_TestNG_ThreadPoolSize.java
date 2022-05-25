/*
Thread Pool Size
----------------
=> It is a parallel execution using attribute.
=> Without invocationCount the threadPoolSize is not working.

SYNTAX
------
@Test(invocationCount = 2, threadPoolSize = 2)

*/
package com.alwaysRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void login() {
		
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			WebElement userName = driver.findElement(By.id("txtUsername"));
			userName.sendKeys("Admin");
			
			WebElement userPass = driver.findElement(By.id("txtPassword"));
			userPass.sendKeys("admin123");
			
			WebElement clk = driver.findElement(By.name("Submit"));
			clk.click();
			
			driver.quit();


	}

}
