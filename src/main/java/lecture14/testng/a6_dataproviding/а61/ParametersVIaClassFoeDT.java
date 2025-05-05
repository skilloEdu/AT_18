package com.n3qa.lecture14.testng.a6_dataproviding.а61;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class ParametersVIaClassFoeDT {

	@DataProvider(name="NumberInputs")
	public Object[][] getDataFromDataProvider(Method m){
		if(m.getName().equalsIgnoreCase("verifyUserCanSumTwoNumberWithParamsProvidedViaFirstMethodInDTClass")) {
		return new Object[][]
				{
					{22,55},
					{40,59}
				};
		}else {
		return new Object[][]
				{
					{10,7},
					{20,1}
				};
		}
	}
}
