package com.n3qa.lecture14.testng.disalbe;

import org.testng.annotations.Test;

public class DisableTestExample {
	@Test(enabled = false)
	public void myTest1() {
		System.out.println("Running my test 1");
	}

	@Test
	public void myTest2() {
		System.out.println("Running my test 2");
	}

}
