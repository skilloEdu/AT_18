package com.n3qa.lecture14.testng.a1_assertions;

import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class AssertNotSameExample {

	String firstProvidedText = "Guests";
	String secondProvidedText = "Niki";

	@Test
	public void verifyTheProvidedTextsAreNotTheSame() {
		String notSameText = "Difference";
		assertNotSame(notSameText, firstProvidedText);
	};
	
	@Test
	public void verifyTheProvidedTextsAreNotTheSameMSGonFail() {
		String uniqueText = "Unique text lives here";
		assertNotSame(uniqueText, secondProvidedText, "References to Str1 is same with references to Str2");
		
	};
	
}
