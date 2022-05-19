package com.day;
import org.testng.annotations.Test;

/*
Suite Level Execution
---------------------
=> If you want to execute more than one class we can go for suite 
   level execution with help of testng.xml file create testng.xml file
=> Select all classes which you want to run.
=> RightClick ---> Click on TestNG option
=> Then click convert to TestNG.
=> Click finish button
=> testng.xml file created
=> To run the testng.xml file -->  RightClick --> RunUs --> TestNG Suite
*/
public class SuiteLevelExecution {
	
	@Test(priority = 1)
	public void startCar() {
		System.out.println("Start Car");
	}

	@Test(priority = 2)
	public void firstGear() {
		System.out.println("Put first gear");
	}

	@Test(priority = 3)
	public void secondGear() {
		System.out.println("Put second gear");
	}
	
	@Test(priority = 4)
	public void thirdGear() {
		System.out.println("Put third gear");
	}
	
	@Test(priority = 5)
	public void fourGear() {
		System.out.println("Put third gear");
	}

}
