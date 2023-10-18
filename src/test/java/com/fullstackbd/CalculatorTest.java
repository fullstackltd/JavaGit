package com.fullstackbd;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @DataProvider
    Object[][] dataSetAdd(){
        Object[][] data = new Object[][]{
                {1, 2, 3},
                {4, 5, 9}
        };
        return data;
    }

    @DataProvider
    Object[][] dataSetSub(){
        Object[][] data = new Object[][]{
                {1, 2, -1},
                {4, 5, -1}
        };
        return data;
    }
    @BeforeMethod
    public void setUp() {

    }

    @AfterMethod
    public void tearDown() {

    }

    @Test(dataProvider = "dataSetAdd")
    public void testAdd(int a, int b, int expectedResult) {
        int actualResult = Calculator.add(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "dataSetSub")
    public void testSub(int a, int b, int expectedResult) {
        int actualResult = Calculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}