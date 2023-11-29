package org.TTA.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {

//    prepared as 2 types . .
//    Static method - Shared by All the Test Cases
//    THread local -means 1 Class or Test per Driver

    //    Static method > >

    static WebDriver driver;

    @BeforeMethod
    static void init(){
        if(driver == null){
            driver=new ChromeDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @AfterMethod
    static void downBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}
