/*
Assertion
---------
=> It use only UnitTesting purpose

*/
package com.alwaysRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	String value = "Manojkumar";
	boolean values = true;
	
	@Test
	public void equalOrNot() {
		
		/*
		 if (value.equals("Manojkumar")) {
			System.out.println("It is a correct");
		}else {
			System.out.println("It is not correct");
		}
		*/
		
		
		//assertEquals String
		Assert.assertEquals(value, "Manojkumar");
		
		////assertEquals boolean
		Assert.assertEquals(values, true);

	}

}
