package org.TTA.Pages.PageObjectModel;

import org.TTA.Base.Basetest;
import org.openqa.selenium.By;

public class DashboardPage_POM extends Basetest {
    public DashboardPage_POM() {
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");




    // Page Actions

    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElemnet(userNameOnDashboard).getText();
    }

}
