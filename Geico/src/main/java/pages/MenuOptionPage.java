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
}
