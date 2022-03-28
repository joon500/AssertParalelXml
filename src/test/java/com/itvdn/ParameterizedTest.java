package com.itvdn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @Parameters({"jj"})
    @Test
    public void prameterTestOne(@Optional("one0") String param) {
        System.out.println("Test one suite param is: " + param);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"data one"}, {"data two"}};
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
