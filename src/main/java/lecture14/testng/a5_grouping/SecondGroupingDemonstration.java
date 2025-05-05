package com.n3qa.lecture14.testng.a5_grouping;

import org.testng.annotations.Test;

public class SecondGroupingDemonstration {

    @Test(groups = "breakfast")
    public void someTestCaseLivesHere(){
        System.out.println("THIS IS A test case from the second different class");
    }
}
