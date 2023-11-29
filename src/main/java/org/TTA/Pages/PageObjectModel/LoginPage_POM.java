package org.TTA.Pages.PageObjectModel;

import org.TTA.Base.Basetest;
import org.TTA.Utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends Basetest {
    public LoginPage_POM() {
        super();
    }

    By username = By.id("login-username");
    By password = By.id("login-password");
    By signinBtn = By.id("js-login-btn");
    By error_msg = By.id("js-notification-box-msg");

    public LoginPage_POM LogintoVWO() throws Exception {

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElemnet(signinBtn);
        return this;
    }

    public LoginPage_POM LogintoVWONegative() throws Exception {

//        enterInput(username, PropertyReader.readKey("username"));

        enterInput(username, "wrongUsername@gmail.com");
        enterInput(password, "wrong_Password");
        clickElemnet(signinBtn);
        return this;
    }

    public String errormsg() {
        presenceOfElement(error_msg);
        return getElemnet(error_msg).getText();
    }

    public DashboardPage_POM afterLogin() {
        return new DashboardPage_POM();
    }
}
