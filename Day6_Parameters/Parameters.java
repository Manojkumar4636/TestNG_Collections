/*
Parameters
----------
=> If you want to pass the parameters 
=> We can use parameter one tag in testng.xml file we can pass more then one parameters.
=> @Parameters ---> import org.testng.annotations.Parameters;

SYNTAX:
-------
@Test
@Parameters({"Parameters_Name"})

XML - FILE
----------
<parameter name = "EnterName" value = "EnterValue"> </parameter>

Optional
--------
=> When the passed parameters is mismatched in class. we can use @Optional one annotation if parameters's
   name in testng.xml and class file are mismatched it will be taking value from @Optional.
=> @Optional ---> import org.testng.annotations.Optional;

*/
package com.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
	
	@Test
	@Parameters({"userName","userPass"})
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
