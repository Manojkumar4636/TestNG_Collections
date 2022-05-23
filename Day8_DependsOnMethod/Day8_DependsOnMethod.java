package com.day4;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DependOnMethod {
	
	@Test()
	public void startCar() {
		System.out.println("Start the Car");
	}

	@Test(dependsOnMethods = "startCar" )
	public void putFirstGear() {
		System.out.println("Put the first gear");
	}

	@Test(dependsOnMethods = "putFirstGear")
	public void putSecondGear() {
		System.out.println("Put the second gear");
	}

	@Test(dependsOnMethods = "putSecondGear")
	public void putThirdGear() {
		System.out.println("Put the third gear");
	}
	@Test(dependsOnMethods = "putThirdGear")
	public void putFourthGear() {
		System.out.println("Put the fourth gear");
	}

}
