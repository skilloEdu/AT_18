package com.n3qa.lecture14.testng.a6_dataproviding.а62;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvideDemoWithDataProviders {
    @DataProvider(name = "mathOperations")
    public Object[][] getDataForDataProvider() {
        return new Object[][]{
                {22, 23, "sum"},
                {2, 3, "multiply"}
        };
    }

    @Test(dataProvider = "mathOperations")
    public void operateWithMathFunctions(int num1, int num2, String operations) {
        int resut = 0;
        switch (operations) {
            case "sum":
                resut = num1 + num2;

                System.out.println("The result is :" + resut);
                break;
            default:
                System.out.println("There was not provided date for math opearations");
        }
    }

    @DataProvider(name = "NumberInputs")
    public Object[][] getDataFromDataProvider() {

        return new Object[][]
                {
                        {22, 33, "sum"},
                        {12, 13, "multiply"}
                };
    }

    @Test(dataProvider = "NumberInputs")
    public void sumOfTwoNumbers(int num1, int num2, String opeartion) {
        int providedNumber1 = num1;
        int providedNumber2 = num1;
        int result = 0;
        String mathLogic = opeartion;

        switch (mathLogic) {
            case "sum":
                result = providedNumber1 + providedNumber2;
                System.out.println("The sun of the provided digits is: " + result);
                break;
            case "multiply":
                result = providedNumber1 * providedNumber2;
                System.out.println("The result of multiplying number 1 and number 2 is  : " + result);

            default:
                System.out.println("NO math operation/logic was provided");
        }
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is :" + sum);
    }
}
