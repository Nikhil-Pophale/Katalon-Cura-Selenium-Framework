package org.TTA.Pages.PageObjectModel;


import io.qameta.allure.Description;
import org.TTA.Base.Common;
import org.openqa.selenium.By;

/**
 * Hello world!
 */
public class LoginPage extends Common {
     private By username = By.id("txt-username");
     private By password = By.id("txt-password");
     private By loginbtn = By.id("btn-login");
     private By cofmsg = By.xpath("//h2[text()=\"Make Appointment\"]");
     private By errormsg = By.xpath("//p[text()=\"Login failed! Please ensure the username and password are valid.\"]");


    @Description("Verify Login with invalid username and invalid password")
    public LoginPage test_invalid_username_and_invalid_password() {
        enterInput(username, "invalidusername");
        enterInput(password, "invalidpassword");
        clickElemnet(loginbtn);

        return this;
    }
    @Description("Verify Login with valid username and invalid password")
    public LoginPage test_valid_username_and_invalid_password() {
        enterInput(username, "John Doe");
        enterInput(password, "invalidpassword");
        clickElemnet(loginbtn);

        return this;
    }

    @Description("Verify Login with valid username and valid password")
    public LoginPage test_valid_username_and_valid_password() {
        implicitWait(5);
        enterInput(username, "John Doe");
        enterInput(password, "ThisIsNotAPassword");
        clickElemnet(loginbtn);
        return this;
    }
    @Description("Verify Login with invalid username and valid password")
    public LoginPage test_invalid_username_and_valid_password() {
        enterInput(username, "invalidusername");
        enterInput(password, "ThisIsNotAPassword");
        clickElemnet(loginbtn);
        return this;
    }

    @Description("Verify Login with keeping both the fields empty ")
    public LoginPage test_Login_with_keeping_both_the_fields_empty() {
        enterInput(username, "");
        enterInput(password, "");
        clickElemnet(loginbtn);

        return this;
    }
    public String errormsg() {
        presenceOfElement(errormsg);

        return getElemnet(errormsg).getText();

    }
    public String makeappconfirmationmessage() {
        presenceOfElement(cofmsg);
        return getElemnet(cofmsg).getText();

    }
    public Make_Appointment afterLogin() {
        return new Make_Appointment();
    }
}
