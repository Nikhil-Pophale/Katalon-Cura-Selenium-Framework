package org.TTA.Pages.PageObjectModel;

import io.qameta.allure.Description;
import org.TTA.Base.Common;
import org.TTA.Driver.DriverManagerTH_Local;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Make_Appointment extends Common {
    private By selectfacility = By.xpath("//select[@id=\"combo_facility\"]/option[2]");
    private By Apply_hospotal_readmission = By.id("chk_hospotal_readmission");
    private By radioProgramMedicaid = By.id("radio_program_medicaid");
    private By txtVisitDate = By.id("txt_visit_date");
    private By comment = By.id("txt_comment");
    private By btnbkappointment = By.id("btn-book-appointment");
    private By Appointconfirmatio = By.id("summary");

    @Description("Verify Book Appointment with all valid data")
    public Make_Appointment test_BookAppointment() {
        implicitWait(5);
        clickElemnet(selectfacility);
        clickElemnet(Apply_hospotal_readmission);
        clickElemnet(radioProgramMedicaid);
        enterInput(txtVisitDate, "10/04/2024");
        enterInput(comment, "this is comment added in the comment box");
        clickElemnet(btnbkappointment);
        String confmsg = getElemnet(Appointconfirmatio).getText();
        System.out.println(confmsg);
        return this;
    }

    @Description("Book Appointment without entering date")
    public Make_Appointment test_without_entering_date() {
        implicitWait(5);
        clickElemnet(selectfacility);
        clickElemnet(Apply_hospotal_readmission);
        clickElemnet(radioProgramMedicaid);
//        enterInput(txtVisitDate, "10/04/2024");
        enterInput(comment, "this is comment added in the comment box");
        clickElemnet(btnbkappointment);
        return this;
    }

    @Description("Book Appointment keeping comment box empty")
    public Make_Appointment test_keeping_comment_box_empty() {
        implicitWait(5);
        clickElemnet(selectfacility);
        clickElemnet(Apply_hospotal_readmission);
        clickElemnet(radioProgramMedicaid);
        enterInput(txtVisitDate, "10/04/2024");
        enterInput(comment, "");

        return this;
    }

    @Description("Book Appointment keeping all the fields empty")
    public Make_Appointment test_keeping_all_field_empty() {

        clickElemnet(btnbkappointment);

        return this;
    }

    @Description("Book Appointment with selecting medicaid health programme")
    public Make_Appointment selecting_medicaid_health_programme() {
        implicitWait(5);
        clickElemnet(selectfacility);
        clickElemnet(Apply_hospotal_readmission);
        clickElemnet(radioProgramMedicaid);
        enterInput(txtVisitDate, "10/04/2024");
        enterInput(comment, "");
        clickElemnet(btnbkappointment);
        String confmsg = getElemnet(Appointconfirmatio).getText();
        System.out.println(confmsg);
        return this;
    }

    @Description(" Book Appointment with past date")
    public Make_Appointment with_past_date() {
        implicitWait(5);
        clickElemnet(selectfacility);
        clickElemnet(Apply_hospotal_readmission);
        clickElemnet(radioProgramMedicaid);
        enterInput(txtVisitDate, "10/04/2020");
        enterInput(comment, "comment");
        clickElemnet(btnbkappointment);
        String confmsg = getElemnet(Appointconfirmatio).getText();
        System.out.println(confmsg);
        return this;
    }

    public History afterMakeappointment() {
        return new History();
    }
}
