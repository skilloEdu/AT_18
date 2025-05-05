package com.n3qa.lecture14.testng.a1_assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssertFalseDemonstration {

	/**
	 * <head>
	 *     <b> TEST CASE :</b>
	 * Verify that the first provided integer number is bigger than the second provided integer number </head>
	 * <p> Inside the test case a method that accept 2 integer numbers will be providing a calculation
	 *  <p>
	 *      <i>
	 *          <b>
	 *      *** TESTNG *** assertion via EQUALS => BOOLEAN  => ADDING MSG ON FAIL ***
	 *  		</b>
	 * 		 </i>
	 *  </p
	 * @author Nikolay Nikolov
	 */
	@Test
	public void verifyFirstProvidedNumberIsBiggerThanTheSecondProvidedNumber() {
		double firstNumber = 3216.23;
		double secondNumber= 321352634.63;

		boolean isFirstNumberBigger = firstNumber>secondNumber;


		assertFalse(isFirstNumberBigger);


	};

	//TO DO with other types
}
