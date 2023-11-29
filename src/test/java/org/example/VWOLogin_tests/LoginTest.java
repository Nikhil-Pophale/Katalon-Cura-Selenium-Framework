package org.example.VWOLogin_tests;

import org.TTA.Pages.PageObjectModel.DashboardPage_POM;
import org.TTA.Pages.PageObjectModel.LoginPage_POM;
import org.TTA.Utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.example.basetest.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    //Without Chaining > >
    @Test
    public void testLoginNegative() throws Exception {
        LoginPage_POM loginPagePom=new LoginPage_POM();
        loginPagePom.openUrl(PropertyReader.readKey("url"));
        loginPagePom.LogintoVWONegative();
        System.out.println(loginPagePom.errormsg());
    }

    @Test
    public void testLoginPositive() throws Exception {
        LoginPage_POM loginPagePom=new LoginPage_POM();
        loginPagePom.openUrl(PropertyReader.readKey("url"));
        loginPagePom.LogintoVWO();
        DashboardPage_POM dashboardPagePom=loginPagePom.afterLogin();
        Thread.sleep(3000);
        String expectedusername=dashboardPagePom.loggedInUserName();
        Assertions.assertThat(expectedusername).isNotNull().isNotBlank().contains(PropertyReader.readKey("expected_username"));
    }

    // Chaining > >

}




