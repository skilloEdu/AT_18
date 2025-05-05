package com.n3qa.lecture14.testng.a1_assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class AssertNotNullDemonstration {
    String nullStringAsInput = null;

    /**
     * <head>
     * <b> TEST CASE :</b>
     * Verify there is no empty or null text provided by the user </head>
     *
     * <p>
     * <i>
     * <b>
     * *** TESTNG *** assertion via NOT NULL => STRING  ***
     * </b>
     * </i>
     * </p
     *
     * @author Nikolay Nikolov
     */

    @Test
    public void verifyThereIsNoNullTextProvided() {
       String something = "asdasd";
	   assertNotNull(something);
    };

    /**
     * <head>
     * <b> TEST CASE :</b>
     * Verify there is no empty or null text provided by the user </head>
     *
     * <p>
     * <i>
     * <b>
     * *** TESTNG *** assertion via NOT NULL => STRING => MSG on FAIL ***
     * </b>
     * </i>
     * </p
     *
     * @author Nikolay Nikolov
     */
    @Test
    public void verifyThereIsNoNullTextProvidedMSGonFail() {
        String testText = "Hello people";
        assertNotNull(testText, "The provided text is missing - null");
    };

    @Test
    public void verifyProvidedTextIsNotNull_FAIL() {
        assertNotNull(nullStringAsInput);
    };

    @Test
    public void verifyProvidedTextIsNotNull_FAIL_With_MSG() {
        assertNotNull(nullStringAsInput, " !!! The string is null !!!");
    };
}
