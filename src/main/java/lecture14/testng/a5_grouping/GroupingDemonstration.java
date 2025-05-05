package com.n3qa.lecture14.testng.a5_grouping;

import org.testng.annotations.Test;

import static com.n3qa.lecture14.testng.SupportMethods.separateTestCaseHeaders;

public class GroupingDemonstration {

    @Test(priority = 0, groups = {"breakfast"})
    public void verifyForBreakfastThereIsAJuice(){
        separateTestCaseHeaders(" Verify for breakfast there is a juice ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the breakfast menu there is a orange juice and other juice types");
        System.out.println("STEP 3: The user order a juice from the menu list");
        System.out.println("STEP 4: The order with the juice is provided to the user-client");

    };

    @Test(priority = 0, groups = {"breakfast"})
    public void verifyForBreakfastThereIsCereals (){
        separateTestCaseHeaders(" Verify for breakfast there are cereals ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the breakfast menu there different types of cereals");
        System.out.println("STEP 3: The user order a cereal from the menu list");
        System.out.println("STEP 4: The order with the cereals is provided to the user-client");
    };

    @Test(priority = 0, groups = {"breakfast"})
    public void verifyForBreakfastThereIsNuts (){
        separateTestCaseHeaders(" Verify for breakfast there are nuts ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the breakfast menu there different types of nuts");
        System.out.println("STEP 3: The user order nuts from the menu list");
        System.out.println("STEP 4: The order with the nuts is provided to the user-client");
    };

    @Test(priority = 0, groups = {"launch"})
    public void verifyForLaunchThereIsSoup (){
        separateTestCaseHeaders(" Verify for breakfast there are different types of soup ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the launch menu there different types of soup");
        System.out.println("STEP 3: The user order soup from the menu list");
        System.out.println("STEP 4: The order with the soup is provided to the user-client");
    };

    @Test(priority = 0, groups = {"launch", "dinner"})
    public void verifyForLaunchThereIsSalad (){
        separateTestCaseHeaders(" Verify for breakfast there are different types of salads ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the launch menu there different types of salads");
        System.out.println("STEP 3: The user order a salad from the menu list");
        System.out.println("STEP 4: The order with the salad is provided to the user-client");
    };

    @Test(priority = 0, groups = {"dinner"})
    public void verifyForDinnerThereIsMainCourse (){
        separateTestCaseHeaders(" Verify for breakfast there are different types of main course ");
        System.out.println("STEP 1: The user enters the restaurant dining room");
        System.out.println("STEP 2: In the launch menu there different types of main course");
        System.out.println("STEP 3: The user order a main course from the menu list");
        System.out.println("STEP 4: The order with the main course is provided to the user-client");
    };
}
