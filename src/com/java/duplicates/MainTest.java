package com.java.duplicates;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
     void remove(){

        Assert.assertEquals(Main.removeDuplicate("abbaca"),"ca");
        Assert.assertEquals(Main.removeDuplicate("xyaaya"),"xa");
        Assert.assertEquals(Main.removeDuplicate("gimmicks"),"gcks");
        Assert.assertEquals(Main.removeDuplicate("effected"),"cted");
        Assert.assertEquals(Main.removeDuplicate("irritant"),"tant");



    }
}