package com.n3qa.lecture14.testng.a6_dataproviding.а63;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TimeoutTestExample {
    @Parameters({"fullName"})
    @Test()
    public void provideSingleParamDemo(@Optional("Guest") String name){
        System.out.println("WELCOME " + name );
    }

    @Parameters ({"firstName","lastName","age"})
    @Test ()
    public void testMultiParameters(String fName,String lName,String age){

        ;
        System.out.println("Greeting from " + fName+ " lName "+". And I am  "+age +" old." );
    }
}
