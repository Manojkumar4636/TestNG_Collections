package com.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@DataProvider(name = "LoginData")
	public String[][] dataProvider() {
		String [][] data = {
				{"manojkumarsp009@gmail.com","manoj143"},
				{"Admin","admin123"}
		};
		return data;

	}

	@Test(dataProvider = "LoginData")
	public void loginTestCase(String uName, String uPass) {

	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			WebElement userName = driver.findElement(By.id("txtUsername"));
			userName.sendKeys(uName);
			
			WebElement userPass = driver.findElement(By.id("txtPassword"));
			userPass.sendKeys(uPass);
			
			WebElement clk = driver.findElement(By.name("Submit"));
			clk.click();
			
			driver.quit();



	}
}
