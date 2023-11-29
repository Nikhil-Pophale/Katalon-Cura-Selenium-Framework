package org.TTA.Base;

import org.TTA.Driver.DriverManager;
import org.TTA.Driver.DriverManagerTH_Local;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class Basetest {
    public Basetest() {
    }

    //    It might have 1>waits2>drivers 3>locartors 4>common things
   public void implicitWait(){
       DriverManagerTH_Local.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void clickElemnet(By by){
        DriverManagerTH_Local.getDriver().findElement(by).click();
    }
    public void openUrl(String url){
        DriverManagerTH_Local.getDriver().get(url);
    }
    protected void enterInput(By by, String key) {
        DriverManagerTH_Local.getDriver().findElement(by).sendKeys(key);
    }
    public WebElement getElemnet(By key){
        return DriverManagerTH_Local.getDriver().findElement(key);
    }
    public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManagerTH_Local.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
}
