package com.n3qa.lecture14.testng.a2_annotations.before;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostFeature {


	@Test
	public void verifyUserCanUpdateProfileGenderInformation(){
		separateTestCaseHeaders("TEST CASE : Verify user can update profile gender information.");

		System.out.println("STEP 1: The user has navigated on the my account page aka profile page for device with resolution and OS");
		System.out.println("STEP 2: The clicked on edit profile gender information button");
		System.out.println("STEP 3: The user has provided sex");
		System.out.println("STEP 4:  The user has clicked on submit profile edited information");
		System.out.println("STEP 5:  The profile information was submitted and the user was redirected to my account page/n");
	};

	@Test
	public void verifyUserCanCreateANewPost(){
		separateTestCaseHeaders("TEST CASE : verify the user can create a new post");

		System.out.println("STEP 1: The user has navigated to post feed page for device with resolution and OS");
		System.out.println("STEP 2: The user has clicked on create a new post button");
		System.out.println("STEP 3: The populates with valid data the new post form");
		System.out.println("STEP 4: The use clicks on submit new post button");
		System.out.println("STEP 5: The new post information was submitted and the user was redirected to post feed page/n");
	};

	@BeforeMethod
	public void clearCookies(){
		separateAnnotations(" CLEAR cookies and set browser settings");
	}

	public void separateAnnotations(String textInfo) {
		    System.out.println();
			System.out.print(" %%%% ");
			System.out.printf(textInfo);
			System.out.print(" %%%% ");
			System.out.println();
			System.out.println("*****************************************************");
		}

	public void separateTestCaseHeaders(String testCaseHeader) {
		System.out.println("\n===   "+testCaseHeader+"   ==== ");

	}



}