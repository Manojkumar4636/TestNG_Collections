/*
InvocationCount
---------------
=> To run the same testcases in multiple times.

SYNTAX:
-------
@Test(invocationCount = 3)

InvocationTimeOut
-----------------
=> Methods Execution is complete in the particular time, else TimeOutException error will be throw.

SYNTAX:
-------
@Test(invocationTimeOut = 1000)     //1000ms is a 1sec

*/
package com.day5;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3, invocationTimeOut = 1000)
	public void clickLoginBtn() {
		System.out.println("Successfully Click");
	}

}
