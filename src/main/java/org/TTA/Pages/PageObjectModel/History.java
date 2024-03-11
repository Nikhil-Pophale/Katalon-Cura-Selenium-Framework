package org.TTA.Pages.PageObjectModel;

import org.TTA.Base.Common;
import org.openqa.selenium.By;

public class History extends Common {
    private By historytab = By.xpath("//nav[@id=\"sidebar-wrapper\"]/ul/li[3]");
    private By historytabbtn = By.xpath("//a[@id=\"menu-toggle\"]");
    private By historyinfo = By.xpath("//div[@class=\"panel-body\"]");
    private By date = By.xpath("//div[@class=\"panel-heading\"]");

    public History test_date_history() {
        clickElemnet(historytabbtn);
        clickElemnet(historytab);

        return this;
    }

    public String historyInfo() {
        presenceOfElement(historyinfo);
        return getElemnet(historyinfo).getText();
    }

    public String historydate() {
        presenceOfElement(date);
        return getElemnet(date).getText();
    }
}
