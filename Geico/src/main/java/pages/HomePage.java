package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{

    @FindBy (xpath = "//div[@data-product='auto']")
    WebElement selectautoCheckbox;

    @FindBy (xpath = "//*[@id=\"bundleModalBtn\"]/p/a")
    WebElement clickstartmyquoteButton;

    @FindBy (xpath = "//div[@class='zip-holder']")
    WebElement selectZiptextbox;

    @FindBy (xpath = "//input[@name='POL_ratedZip5']")
    WebElement inputZip;

    @FindBy (xpath = "/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[2]/div/input")
    WebElement inputFirstname;

    @FindBy (xpath = "/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[3]/div/input")
    WebElement inputLastname;

    public WebElement getSelectautoCheckbox() {
        return selectautoCheckbox;
    }

    public WebElement getClickstartmyquoteButton() {
        return clickstartmyquoteButton;
    }

    public WebElement getSelectZiptextbox() {
        return selectZiptextbox;
    }

    public WebElement getInputZip() {
        return inputZip;
    }

    public WebElement getInputFirstname() {
        return inputFirstname;
    }

    public WebElement getInputLastname() {
        return inputLastname;
    }

        public void testingGetQuote() {

            clickOn(getSelectautoCheckbox());
            waitFor(2);
            clickOn(getClickstartmyquoteButton());
            waitFor(2);
            clickOn(getSelectZiptextbox());
            typeEnter(getInputZip(), "92374");
            typeEnter(getInputFirstname(), "Chowdhury");
            waitFor(2);
            typeEnter(getInputLastname(), "Ahmed");
            waitFor(2);
    }

    @FindBy(xpath = "//a[@data-link-name='accessibility-main-content:Make a payment']")
    WebElement clickonmakeaPayment;

    @FindBy(xpath = "//*[@id=\"SelectComponent-1\"]")
    WebElement selectdropDown;

    @FindBy(xpath = "//*[@id=\"TextInputTelComponent-1\"]")
    WebElement inputPhone;

    @FindBy(xpath = "//*[@id=\"TextInputZipComponent-1\"]")
    WebElement enterZip;

    @FindBy(xpath = "//*[@id=\"paymentForm\"]/div/div/asd-submit-button/button")
    WebElement enterContinue;

    public WebElement getClickonmakeaPayment() {
        return clickonmakeaPayment;
    }

    public WebElement getSelectdropDown() {
        return selectdropDown;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public WebElement getEnterZip() {
        return enterZip;
    }

    public WebElement getEnterContinue() {
        return enterContinue;
    }

    public void testMakeapayment() {
        clickOn(getClickonmakeaPayment());
        waitFor(2);
        selectDropdownElement(getSelectdropDown(),"Phone Number");
        waitFor(2);
        clickOn(getInputPhone());
        waitFor(2);
        typeInto(getInputPhone(),"9097359511");
        waitFor(2);
        clickOn(getEnterZip());
        waitFor(2);
        typeInto(getEnterZip(),"92374");
        waitFor(2);
        clickOn(getEnterContinue());
        waitFor(2);
    }

    @FindBy(xpath = "//*[@id=\"accessibility-main-content\"]/div[3]/div/div[1]/div/div/ul/li[2]/a")
    WebElement clickonGetidcard;

    @FindBy(xpath = "//*[@id=\"SelectComponent-1\"]")
    WebElement clickonDD;

    @FindBy(xpath = "//*[@id=\"TextInputTelComponent-1\"]")
    WebElement clickonph;


    @FindBy(xpath = "//*[@id=\"TextInputZipComponent-1\"]")
    WebElement clickonZP;

    @FindBy(xpath = "//*[@id=\"idCardForm\"]/asd-checkbox-group/asd-fieldset/fieldset/div/div[1]/label")
    WebElement checkonEmail;


    public WebElement getClickonGetidcard() {
        return clickonGetidcard;
    }

    public WebElement getClickonDD() {
        return clickonDD;
    }

    public WebElement getClickonph() {
        return clickonph;
    }

    public WebElement getClickonZP() {
        return clickonZP;
    }

    public WebElement getCheckonEmail() {
        return checkonEmail;
    }

    public void testingGetID() {
        clickOn(getClickonGetidcard());
        waitFor(2);
        selectDropdownElement(getClickonDD(),"Phone Number");
        waitFor(2);
        clickOn(getClickonph());
        waitFor(2);
        typeInto(getClickonph(),"9097359511");
        waitFor(2);
        clickOn(getClickonZP());
        waitFor(2);
        typeInto(getClickonZP(),"92374");
        waitFor(2);
        clickOn(getCheckonEmail());
        waitFor(2);
    }

    @FindBy(xpath = "//*[@id=\"accessibility-main-content\"]/div[3]/div/div[1]/div/div/ul/li[4]/a")
    WebElement clickonGoPaperless;

    @FindBy(xpath = "//*[@id=\"SelectComponent-1\"]")
    WebElement selectDrDwn;

    @FindBy(xpath = "//*[@id=\"TextInputTelComponent-1\"]")
    WebElement selectphNm;

    @FindBy(xpath = "//*[@id=\"TextInputZipComponent-1\"]")
    WebElement selectZipcd;

    @FindBy(xpath = "//*[@id=\"paperlessForm\"]/div/div/asd-submit-button/button")
    WebElement clickonEnrollbutton;


    public WebElement getClickonGoPaperless() {
        return clickonGoPaperless;
    }

    public WebElement getSelectDrDwn() {
        return selectDrDwn;
    }

    public WebElement getSelectphNm() {
        return selectphNm;
    }

    public WebElement getSelectZipcd() {
        return selectZipcd;
    }

    public WebElement getClickonEnrollbutton() {
        return clickonEnrollbutton;
    }

    public void testingGoPaperless() {
        clickOn(getClickonGoPaperless());
        waitFor(2);
        selectDropdownElement(getSelectDrDwn(),"Phone Number");
        waitFor(2);
        clickOn(getSelectphNm());
        waitFor(2);
        typeInto(getSelectphNm(),"9097359511");
        waitFor(2);
        clickOn(getSelectZipcd());
        waitFor(2);
        typeInto(getSelectZipcd(),"92374");
        waitFor(2);
        clickOn(getClickonEnrollbutton());
        waitFor(2);
    }

    @FindBy(xpath = "//a[@data-link-name='accessibility-main-content:Protect Your Home']")
    WebElement protectyourHome;

    @FindBy(xpath = "//*[@id=\"content\"]/header/div/a[4]")
    WebElement homeProtection;

    @FindBy(xpath = "//*[@id=\"post-18123\"]/a/figure/img")
    WebElement packagestolenfromHome;

    @FindBy(xpath = "//*[@id=\"comment\"]")
    WebElement commentBox;

    public WebElement getProtectyourHome() {
        return protectyourHome;
    }

    public WebElement getHomeProtection() {
        return homeProtection;
    }

    public WebElement getPackagestolenfromHome() {
        return packagestolenfromHome;
    }

    public WebElement getCommentBox() {
        return commentBox;
    }

    public void protectyourHome() {
        clickOn(getProtectyourHome());
        waitFor(2);
        clickOn(getHomeProtection());
        waitFor(2);
        clickOn(getPackagestolenfromHome());
        waitFor(2);
        clickOn(getCommentBox());
        waitFor(2);
        typeInto(getCommentBox(),"Good Tips!");
        waitFor(2);
    }

    @FindBy(xpath = "//a[@data-link-name='accessibility-main-content:Saving Money']")
    WebElement savingMoney;

    @FindBy(xpath = "//*[@id=\"content\"]/header/div/a[2]")
    WebElement lifeHacks;

    @FindBy(xpath = "//*[@id=\"post-9664\"]/a/figure/img")
    WebElement packLight;

    @FindBy (xpath = "//*[@id=\"comment\"]")
    WebElement commenttxt;

    @FindBy (xpath = "//*[@id=\"author\"]")
    WebElement enterNM;


    public WebElement getSavingMoney() {
        return savingMoney;
    }

    public WebElement getLifeHacks() {
        return lifeHacks;
    }

    public WebElement getPackLight() {
        return packLight;
    }

    public WebElement getCommenttxt() {
        return commenttxt;
    }

    public WebElement getEnterNM() {
        return enterNM;
    }

    public void testingSavingmoney() {

        clickOn(getSavingMoney());
        waitFor(2);
        clickOn(getLifeHacks());
        waitFor(2);
        clickOn(getPackLight());
        waitFor(2);
        clickOn(getCommenttxt());
        waitFor(2);
        typeInto(getCommenttxt(),"Great Tips!");
        waitFor(2);
        clickOn(getEnterNM());
        waitFor(2);
        typeInto(getEnterNM(),"Ahmed");
        waitFor(2);

    }

    @FindBy(xpath = "//a[@data-link-name='accessibility-main-content:GEICO Commercials']")
    WebElement geicoCommercials;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div[2]/article[1]/a/figure/img")
    WebElement geckolatestAdventures;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/article[1]/a/figure/img")
    WebElement tagTeam;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/article[2]/a/header")
    WebElement aniMal;

    @FindBy(xpath = "//video[@class='video-stream html5-main-video']")
    WebElement playCommercial;

    public WebElement getGeicoCommercials() {
        return geicoCommercials;
    }

    public WebElement getGeckolatestAdventures() {
        return geckolatestAdventures;
    }

    public WebElement getTagTeam() {
        return tagTeam;
    }

    public WebElement getAniMal() {
        return aniMal;
    }

    public WebElement getPlayCommercial() {
        return playCommercial;
    }

    public void testingCommercial() {
        clickOn(getGeicoCommercials());
        waitFor(3);
        clickOn(getGeckolatestAdventures());
        waitFor(3);
        clickOn(getTagTeam());
        waitFor(3);
        clickOn(getAniMal());
        waitFor(3);
        clickOn(getPlayCommercial());
        waitFor(50);
    }

}
