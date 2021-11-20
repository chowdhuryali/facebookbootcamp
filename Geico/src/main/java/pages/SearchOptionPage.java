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

    @FindBy(xpath = "//*[@id=\"search\"]/div[2]/div/div[1]/div[2]/div[3]/ul/li[1]/label/div")
    WebElement veHicle;


    @FindBy(xpath = "//*[@id=\"search\"]/div[2]/div/div[1]/div[2]/div[3]/ul/li[2]/label/div")
    WebElement pRoperty;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/div/div[2]/form/button")
    WebElement sEarch;

    public WebElement getsEarch() {
        return sEarch;
    }

    public WebElement getVeHicle() {
        return veHicle;
    }

    public WebElement getpRoperty() {
        return pRoperty;
    }



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

    public void searchGEICO() {
        clickOn(getClinkonSearch());
        waitFor(2);
        clickOn(getSelectsearchBar());
        waitFor(2);
        typeInto(getSelectsearchBar(),"why insurance cost is so high?");
        waitFor(2);
        clickOn(getsEarch());
        waitFor(2);
        clickOn(getVeHicle());
        waitFor(2);
        clickOn(getpRoperty());
        waitFor(2);
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/div/div[2]/div/ul/li[2]/a")
    WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"questionnaire\"]/div/div[6]/label")
    WebElement somethingElse;

    @FindBy(xpath = "//*[@id=\"btn_continue\"]")
    WebElement conTinue;

    @FindBy(xpath = "//*[@id=\"something_else\"]/div[4]/label")
    WebElement mkPayment;


    public WebElement getContactUs() {
        return contactUs;
    }

    public WebElement getSomethingElse() {
        return somethingElse;
    }

    public WebElement getConTinue() {
        return conTinue;
    }

    public WebElement getMkPayment() {
        return mkPayment;
    }


    public void testingContactus() {
        clickOn(getClinkonSearch());
        waitFor(2);
        clickOn(getContactUs());
        waitFor(2);
        clickOn(getSomethingElse());
        waitFor(2);
        clickOn(getConTinue());
        waitFor(2);
        clickOn(getMkPayment());
    }

    @FindBy(xpath = "//*[@id=\"search\"]/div[2]/div/div[2]/div[8]/div/div[1]/div/h2/a")
    WebElement findAgent;

    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement yourAddress;

    public WebElement getFindAgent() {
        return findAgent;
    }

    public WebElement getYourAddress() {
        return yourAddress;
    }

    public void testingSearchbar() {

        clickOn(getClinkonSearch());
        waitFor(2);
        clickOn(getSelectsearchBar());
        waitFor(2);
        typeEnter(getSelectsearchBar(),"agents");
        waitFor(2);
        clickOn(getFindAgent());
        waitFor(2);
        clickOn(getYourAddress());
        waitFor(2);
        typeEnter(getYourAddress(),"new york");
        waitFor(5);



    }






}
