package org.example.basic;

import static org.junit.Assert.assertTrue;

import org.TTA.Driver.DriverManagerTH_Local;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

/**
 * Unit test for simple App.
 */
public class BaseTest
{
    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DriverManagerTH_Local.init();
    }

    @AfterMethod
    protected void tearDown(){
        DriverManagerTH_Local.down();
    }
}
