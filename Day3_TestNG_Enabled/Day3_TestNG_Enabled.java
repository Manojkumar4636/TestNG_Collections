/*
Enabled
-------
=> Ignoring the particular test methods

SYNTAX:
-------
@Test(enabled = false)

*/
package com.day3;

import org.testng.annotations.Test;

public class EnabledParametter {
	
	@Test(priority = 1)
	public void startCar() {
		System.out.println("Start Car");
	}

	@Test(priority = 2)
	public void firstGear() {
		System.out.println("Put first gear");
	}

	//enabled = false
	
	@Test(priority = 3, enabled = false)
	public void secondGear() {
		System.out.println("Put second gear");
	}
	
	@Test(priority = 4)
	public void thirdGear() {
		System.out.println("Put third gear");
	}
	
	@Test(priority= 5)
	public void fourGear() {
		System.out.println("Put fourth gear");
	}

}
