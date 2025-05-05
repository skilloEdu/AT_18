package com.n3qa.lecture14.testng.a4_dependings;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.n3qa.lecture14.testng.SupportMethods.separateTestCaseHeaders;

public class DependencyDemonstration {

    @Test(priority = 0)
    public void verifyCarEngineCanStart(){
        separateTestCaseHeaders(" Verify user can start car engine ");
        System.out.println("STEP 1: Car Engine button was pushed once");
        System.out.println("STEP 2: Car Engine electricity and electrical monitoring system started as per requirements ");
        System.out.println("STEP 3: Car Engine start with initial motion rotation capacity");
        boolean isStarted = false;
        Assert.assertEquals(isStarted, false);
    };

    @Test (dependsOnMethods = "verifyCarEngineCanStart", priority =  1)
    public void verifyUserCanIncreaseSpeedLevelByGasPedal(){
        separateTestCaseHeaders(" Verify user can increase car speed level by tapping on gas pedal ");
        System.out.println("STEP 1: Verify user can start car engine ");
        System.out.println("STEP 2: The user pushes the gas pedal and the car starts to move");
        System.out.println("STEP 3: The user does not push the car gas pedal and the car is not moving");
    };

    @Test (dependsOnMethods =  "verifyUserCanIncreaseSpeedLevelByGasPedal", priority = 2)
    public void verifyUserCanDecreaseSpeedLevelByGasPedal(){
        separateTestCaseHeaders(" Verify user can decrease car speed level by tapping on gas pedal ");
        System.out.println("STEP 1: Verify car speed level is increased ");
        System.out.println("STEP 2: The user has moved 50% up the foot body from the gas pedal");
        System.out.println("STEP 3: The car speed level is reduced as per requirements");
    };

    @Test (priority = 1)
    public void verifyFrontTyresDirectionControlledByCarWheelMovement(){
        separateTestCaseHeaders(" verify front tyres direction controlled by car wheel movement ");
        System.out.println("STEP 1: The user has turn on the wheel to the right");
        System.out.println("STEP 2: The tyres are turned on to the right accordingly ");

    };

    @Test ( dependsOnMethods = {"verifyUserCanIncreaseSpeedLevelByGasPedal","verifyUserCanIncreaseSpeedLevelByGasPedal","verifyUserCanDecreaseSpeedLevelByGasPedal" }, alwaysRun = true)
    public void verifyUserCanDriveCar(){
        System.out.println("STEP 1: THe user has parked the car");
    }

}
