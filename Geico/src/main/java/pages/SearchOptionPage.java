package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchOptionPage extends CommonAPI {

    @FindBy(css = "#primary-header > div.header-links > ul > li:nth-child(2) > a")
    WebElement clinkonSearch;

    @FindBy (css = "input[placeholder='Search geico.com']")
    WebElement selectsearchBar;

    @FindBy(xpath = "//*[@id=\"search\"]/div[2]/div/div[1]/div[2]/div[2]/ul/li[1]/label")
    WebElement checkonmanagemyAccount;

    @FindBy(xpath = "//*[@id=\"search\"]/div[2]/div/div[1]/div[2]/div[2]/ul/li[2]")
    WebElement checkClaims;

    public WebElement getClinkonSearch() {
        return clinkonSearch;
    }

    public WebElement getSelectsearchBar() {
        return selectsearchBar;
    }

    public WebElement getCheckonmanagemyAccount() {
        return checkonmanagemyAccount;
    }

    public WebElement getCheckClaims() {
        return checkClaims;
    }

    public void testingSearch() {
        clickOn(getClinkonSearch());
        waitFor(2);
        clickOn(getSelectsearchBar());
        waitFor(2);
        typeEnter(getSelectsearchBar(),"auto");
        waitFor(2);
        clickOn(getCheckonmanagemyAccount());
        waitFor(2);
        clickOn(getCheckClaims());
        waitFor(2);

    }

}
