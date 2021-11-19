package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {



    @FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //exit popup



    public WebElement getGoodtiding() {
        return goodtiding;
    }

    // pop up cancel
    public void closingpopup(){
        clickOn(getGoodtiding());
    }






}
