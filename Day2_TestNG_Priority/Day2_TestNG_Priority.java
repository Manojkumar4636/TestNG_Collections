/*
Priority
---------
=> By default the test methods are executed in Alphabetical (or) Ascending order
=> When we want to change the order of the test methods we can go for the concept called priority.
=> Default priority for any test is 0.
=> Priority we can give -ve (or) +ve value
   ( @Test with most negative integer will be runned first and @Test with most positive integer will be executed last )

SYNTAX:
-------
@Test(priority = 3)

*/
package com.day2;

import org.testng.annotations.Test;

public class Priority {

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
	
	@Test(priority= 5)
	public void fourGear() {
		System.out.println("Put fourth gear");
	}

}
