package org.example.VWOLogin_tests;

import io.qameta.allure.Description;
import org.TTA.Driver.DriverManagerTH_Local;
import org.TTA.Pages.PageObjectModel.History;
import org.TTA.Pages.PageObjectModel.LoginPage;
import org.TTA.Pages.PageObjectModel.Make_Appointment;
import org.example.basic.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Katloan_RC_Runner extends BaseTest {


    @Test(priority =1)
    @Description("Verify Login with invalid username and invalid password")
    public void TC_001() throws InterruptedException {
        System.out.println(DriverManagerTH_Local.getDriver());
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_invalid_username_and_invalid_password();
        String errormsg = loginPage.errormsg();
        org.junit.Assert.assertEquals(errormsg, "Login failed! Please ensure the username and password are valid.");
        System.out.println(errormsg);
    }

    @Test(priority =4)
    @Description("Verify Login with valid username and invalid password")
    public void TC_002() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_invalid_password();
        String errormsg = loginPage.errormsg();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(errormsg, "Login failed! Please ensure the username and password are valid.");
        System.out.println(errormsg);
    }

    @Test(priority =12)
    @Description("Verify Book Appointment with all valid data")
    public void TC_006() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.test_BookAppointment();

    }


    @Test(priority =6)
    @Description("Book Appointment with selecting medicaid health programme")
    public void TC_007() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.selecting_medicaid_health_programme();

    }

    @Test(priority =7)
    @Description("Verify keeping_comment_box_empty")
    public void TC_008() throws Exception {

        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.test_keeping_comment_box_empty();

    }

    @Test(priority =9)
    @Description("Verify Appointment with_past_date")
    public void TC_009() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.with_past_date();

    }

    @Test(priority =8)
    @Description("Verify Appointment without entering date")
    public void TC_010() throws Exception {

        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        loginPage.afterLogin();
        Make_Appointment appointment = new Make_Appointment();
        appointment.test_without_entering_date();

    }

    @Test(priority =10)
    @Description("Verify Appointment keeping_all_field_empty")
    public void TC_011() throws Exception {

        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.test_keeping_all_field_empty();

    }

    @Test(priority =11)
    @Description("Verify date in history passed while booking Appointment")
    public void TC_ConfirmDate() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        Make_Appointment appointment = new Make_Appointment();
        appointment.test_BookAppointment();
        History history = new History();
        history.test_date_history();
        String historyInfo = history.historyInfo();
        String historydate = history.historydate();
        Assert.assertEquals(historydate, "10/04/2024");
        System.out.println(historyInfo);
        System.out.println(historydate);


    }


    @Test(priority =2)
    @Description("Verify login invalid_username_and_valid_password")
    public void TC_003() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_invalid_username_and_valid_password();
        String errormsg = loginPage.errormsg();
        org.junit.Assert.assertEquals(errormsg, "Login failed! Please ensure the username and password are valid.");
        System.out.println(errormsg);
    }

    @Test(priority =5)
    @Description("Verify login valid_username_and_valid_password")
    public void TC_004() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_valid_username_and_valid_password();
        String msg = loginPage.makeappconfirmationmessage();
        org.junit.Assert.assertEquals(msg, "Make Appointment");
        System.out.println(msg);
    }

    @Test(priority =3)
    @Description("Verify login Login_with_keeping_both_the_fields_empty")
    public void TC_005() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage.test_Login_with_keeping_both_the_fields_empty();
        String errormsg = loginPage.errormsg();
        org.junit.Assert.assertEquals(errormsg, "Login failed! Please ensure the username and password are valid.");
        System.out.println(errormsg);
    }

}





