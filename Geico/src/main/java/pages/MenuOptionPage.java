package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuOptionPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"primary-header\"]/div[2]/ul/li[4]/a/span[5]")
    WebElement clickonMenu;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/ul/li[1]/a")
    WebElement clickonInsurance;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[1]/h3")
    WebElement clickonVehicleinsurance;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[2]/div/ul/li[1]/a/span")
    WebElement clickonTypesofvehicle;

    @FindBy(xpath = "//*[@id=\"AutoInsurance\"]/div/p[2]/a")
    WebElement clickonStartautoquote;

    public WebElement getClickonMenu() {
        return clickonMenu;
    }

    public WebElement getClickonInsurance() {
        return clickonInsurance;
    }

    public WebElement getClickonVehicleinsurance() {
        return clickonVehicleinsurance;
    }

    public WebElement getClickonTypesofvehicle() {
        return clickonTypesofvehicle;
    }

    public WebElement getClickonStartautoquote() {
        return clickonStartautoquote;
    }

    public void testingMenuoption() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getClickonVehicleinsurance());
        waitFor(2);
        clickOn(getClickonTypesofvehicle());
        waitFor(2);
        clickOn(getClickonStartautoquote());
        waitFor(3);
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[1]/h3")
    WebElement propertyInsurance;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[1]/a/span")
    WebElement typesofPropertyinsurance;

    @FindBy(xpath = "//*[@id=\"HomeownersInsurance\"]/div/div/form/div/div/input")
    WebElement enterZipcode;

    @FindBy(xpath = "//input[@class='btn btn--primary']")
    WebElement startQuote;

    public WebElement getPropertyInsurance() {
        return propertyInsurance;
    }

    public WebElement getTypesofPropertyinsurance() {
        return typesofPropertyinsurance;
    }

    public WebElement getEnterZipcode() {
        return enterZipcode;
    }

    public WebElement getStartQuote() {
        return startQuote;
    }

    public void testingPropertyinsurance() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getTypesofPropertyinsurance());
        waitFor(2);
        clickOn(getEnterZipcode());
        waitFor(2);
        typeEnter(getEnterZipcode(),"92374");

    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[2]/a/span")
    WebElement homeOwners;

    @FindBy(xpath = "//*[@id=\"zip\"]")
    WebElement entzp;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement srtqut;

    public WebElement getHomeOwners() {
        return homeOwners;
    }

    public WebElement getEntzp() {
        return entzp;
    }

    public WebElement getSrtqut() {
        return srtqut;
    }

    public void testingHomeowners() {

        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getHomeOwners());
        waitFor(2);
        clickOn(getEntzp());
        waitFor(2);
        typeEnter(getEntzp(),"92374");

    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[3]/a/span")
    WebElement renterS;

    @FindBy(xpath = "//*[@id=\"zip\"]")
    WebElement rentersZip;

    @FindBy(xpath = "//input[@class='btn btn--primary btn--full-mobile']")
    WebElement seeyourRate;

    public WebElement getRenterS() {
        return renterS;
    }

    public WebElement getRentersZip() {
        return rentersZip;
    }

    public WebElement getSeeyourRate() {
        return seeyourRate;
    }

    public WebElement getCoveredItems() {
        return coveredItems;
    }

    @FindBy(xpath = "//*[@id=\"first-row\"]/div[2]/p/a")
    WebElement coveredItems;


    public void testingRenters() {

        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getRenterS());
        clickOn(getRentersZip());
        typeEnter(getRentersZip(),"92373");
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[4]/a/span")
    WebElement conDo;

    @FindBy(xpath = "//*[@id=\"faq-accordion\"]/li[1]/div[1]/h3")
    WebElement coOpinsurance;


    public WebElement getConDo() {
        return conDo;
    }

    public WebElement getCoOpinsurance() {
        return coOpinsurance;
    }

    public void testingCondo() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getConDo());
        waitFor(2);
        clickOn(getCoOpinsurance());
        waitFor(2);
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[5]/a/span")
    WebElement mobileHome;

    @FindBy(xpath = "//*[@id=\"faq-accordion\"]/li[1]/div[1]/h3")
    WebElement mobileManf;

    @FindBy(xpath = "//*[@id=\"faq-accordion\"]/li[1]/div[2]/div/a")
    WebElement differencebtw;

    @FindBy(xpath = "//*[@id=\"boxes\"]/div[1]/p/a[1]")
    WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"questionnaire\"]/div/div[1]/label")
    WebElement mypolicyRadio;

    public WebElement getMobileHome() {
        return mobileHome;
    }

    public WebElement getMobileManf() {
        return mobileManf;
    }

    public WebElement getDifferencebtw() {
        return differencebtw;
    }

    public WebElement getContactUs() {
        return contactUs;
    }

    public WebElement getMypolicyRadio() {
        return mypolicyRadio;
    }

    public void mobileHome() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getMobileHome());
        waitFor(3);
        clickOn(getMobileManf());
        waitFor(3);
        clickOn(getDifferencebtw());
        waitFor(3);
        clickOn(getContactUs());
        waitFor(3);
        clickOn(getMypolicyRadio());
        waitFor(3);
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[6]/a/span")
    WebElement landLord;

    @FindBy(xpath = "//*[@id=\"content\"]/section[1]/div/div[2]/p[2]/a[1]")
    WebElement propInsurance;

    public WebElement getLandLord() {
        return landLord;
    }

    public WebElement getPropInsurance() {
        return propInsurance;
    }

    public void landLord() {

        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getLandLord());
        waitFor(2);
        clickOn(getPropInsurance());
        waitFor(2);

    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[2]/div[2]/div/ul/li[7]/a/span")
    WebElement fLood;

    @FindBy(xpath = "//*[@id=\"form-contents\"]/div[1]/p[1]/a")
    WebElement getaQuote;

    public WebElement getfLood() {
        return fLood;
    }

    public WebElement getGetaQuote() {
        return getaQuote;
    }

    public void flood() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getPropertyInsurance());
        waitFor(2);
        clickOn(getfLood());
        waitFor(2);
        clickOn(getGetaQuote());
        waitFor(3);
    }

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[2]/div/ul/li[3]/a/span")
    WebElement motorCycle;

    @FindBy(xpath = "//*[@id=\"sales-form\"]/div/div")
    WebElement zIP;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement sTartquote;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[2]/div/ul/li[4]/a/span")
    WebElement aTV;

    @FindBy(xpath = "//*[@id=\"zip\"]")
    WebElement ziPcode;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement staRtquote;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[2]/div/ul/li[5]/a/span")
    WebElement rV;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement quoTE;

    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[4]/div/div/div[2]/ul/li[1]/div[2]/div/ul/li[6]/a/span")
    WebElement boaT;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement srtQuote;


    public WebElement getMotorCycle() {
        return motorCycle;
    }

    public WebElement getzIP() {
        return zIP;
    }

    public WebElement getsTartquote() {
        return sTartquote;
    }

    public WebElement getaTV() {
        return aTV;
    }

    public WebElement getZiPcode() {
        return ziPcode;
    }

    public WebElement getStaRtquote() {
        return staRtquote;
    }

    public WebElement getrV() {
        return rV;
    }

    public WebElement getQuoTE() {
        return quoTE;
    }

    public WebElement getBoaT() {
        return boaT;
    }

    public WebElement getSrtQuote() {
        return srtQuote;
    }

    public void testingMotorcycle() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getClickonVehicleinsurance());
        waitFor(2);
        clickOn(getMotorCycle());
        waitFor(2);
        clickOn(getzIP());
        waitFor(2);
    }

    public void testingAtv() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getClickonVehicleinsurance());
        waitFor(2);
        clickOn(getaTV());
        waitFor(2);
        clickOn(getZiPcode());
        waitFor(2);
        typeInto(getZiPcode(),"92374");
        waitFor(2);
        clickOn(getStaRtquote());

    }

    public void testingRV() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getClickonVehicleinsurance());
        waitFor(2);
        clickOn(getrV());
        waitFor(2);
        clickOn(getQuoTE() );
        waitFor(2);

    }

    public void testingBoat() {
        clickOn(getClickonMenu());
        waitFor(2);
        clickOn(getClickonInsurance());
        waitFor(2);
        clickOn(getClickonVehicleinsurance());
        waitFor(2);
        clickOn(getBoaT());
        waitFor(2);
        clickOn(getSrtQuote());
    }

}
