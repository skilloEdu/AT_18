package com.n3qa.lecture14.testng.a6_dataproviding.а61;

import org.testng.annotations.Test;

import static com.n3qa.lecture14.testng.SupportMethods.separateTestCaseHeaders;

public class DTParamsViaClassDemo {

	@Test(dataProvider="NumberInputs", dataProviderClass= ParametersVIaClassFoeDT.class)
	public void verifyUserCanSumTwoNumberWithParamsProvidedViaFirstMethodInDTClass(int num1,int num2) {

		separateTestCaseHeaders(" FIRST METHOD : TEST CASE : SUM two params");

		System.out.println("Entry of sumOfTwoNumbersMethodOne");
		int sum = num1+num2;

        System.out.println("Sum of two numbers is :" +sum);
		System.out.println("=====================================");
	}

	@Test(dataProvider="NumberInputs", dataProviderClass= ParametersVIaClassFoeDT.class)
	public void verifyUserCanSumTwoNumberWithParamsProvidedViaSecondMethodInDTClass(int num1,int num2) {
		separateTestCaseHeaders(" SECOND METHOD : TEST CASE : SUM two params");

		int sum = num1+num2;
		System.out.println("Sum of two numbers is :" +sum);
		System.out.println("Exit of sumOfTwoNumbersMethodTwo");
		System.out.println("=====================================");
	}
}


