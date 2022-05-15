/*
TestNG - Test New Generation
----------------------------
=> TestNG is a Testing Framework, it used to test the UnitTesting, FunctionalTesting, IntegrationTesting, End to end Testing
=> Easy to execute Sequential and Parallel execution.

Download Steps
--------------
=> Download the testing jar with latest version 6.14.3.
=> Add the testing plugin the eclipse marketplace.

Advantages of TestNG:
---------------------
=> It provides the defaults HTML reports.
=> Easy to set priority ( We can set order of execution )
=> Easy to pass parameters ( We can pass input as data's from testng.xml file using parameters )
=> DataProvider is possible ( We can pass the bulk of data's at a time for the positive and negative test combinations )
=> Cross browser testing ( To check the compatability and stability of the application and parallel execution is possible
   To save the time consumption )
=> Automatically rerun the failed testcases.
=> Both HardAssert and SoftAssert is possible ( Verify )
=> We can group the bulk of testcases and then we can skip (or) execute the testcases by using the group name.


Annotations:
------------
@BeforeSuite
@BeforeTest
@BeforeClass    -----> Launch Browser
@BeforeGroup
@BeforeMethod   -----> StartTime
@Test           -----> Business Logic
@AfterMethod    -----> EndTime
@AfterGroup
@AfterClass     -----> Quit Browser
@AfterTest
@AfterSuite

NOTE - TestNG:
--------------
=> Private methods allowed in Testng.
=> @BeforeClass and @AfterClass methods need not be static.
=> @Test ---> import org.testng.annotations.Test

NOTE - JUnit:
-------------
=> @BeforeClass and @AfterClass methods should be a static.
=> JUnit support only public methods.
=> @Test mandatory for executions.

*/


package com.day1;

import org.testng.annotations.Test;

public class BasicTestNG {

	@Test
	public void startCar() {
		System.out.println("Start Car");
	}

	@Test
	public void firstGear() {
		System.out.println("Put first gear");
	}

	@Test
	public void secondGear() {
		System.out.println("Put second gear");
	}
	
	@Test
	public void thirdGear() {
		System.out.println("Put third gear");
	}
	
	@Test
	public void fourGear() {
		System.out.println("Put fourth gear");
	}

}
