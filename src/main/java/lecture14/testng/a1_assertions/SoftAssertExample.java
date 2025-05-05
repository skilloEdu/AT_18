package com.n3qa.lecture14.testng.a1_assertions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	@Test
	public void myTest() {
		
		SoftAssert softAssertion = new SoftAssert();

		//assertTrue(checkBigger(5, 10));	
		softAssertion.assertTrue(checkBigger(5,10));
		System.out.println("FIRST CHECK DONE HERE");

		softAssertion.assertTrue(checkBigger(5,10));
		System.out.println("SECOND CHECK DONE HERE");

		System.out.println("WILL STOP HERE ");
		softAssertion.assertAll();
	}
	
	@Test
	public void myTestTwo() {
		
		assertTrue(checkBigger(10, 5));	
		
	};
	public boolean checkBigger(int x, int y) {
		
		boolean result;
		if(x>y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	};
	
}
