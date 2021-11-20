package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickingHomePageLinks extends CommonAPI {



    @FindBy (xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //pop up element


    @FindBy(xpath = "//*[@id=\"widget-455bae9a-c219-4271-b804-294e5139a37f\"]/div/div[3]/div[3]/a")
    WebElement Apple;       //clicking apple on homepage



    @FindBy(xpath = "//img[@alt='Laptops & Computers']")
    WebElement Laptop_Computers;

    @FindBy(partialLinkText = "Video Games, Consoles")
    WebElement Video_Games_Consoles_VRDeals;


//====================GETTER  METHODS ====================



    public WebElement getGoodtiding() {
        return goodtiding;
    }



    public WebElement getVideo_Games_Consoles_VRDeals(){
        return Video_Games_Consoles_VRDeals;
    }

    public WebElement getLaptop_Computers() {
        return Laptop_Computers;
    }


    public WebElement getApple() {
        return Apple;
    }




//==================METHODD===========================



     //pop up cancel
    public void closingpopup(){
        waitUntilVisible(getGoodtiding());
        clickOn(getGoodtiding());
    }

    //no need
    public void loadingApple() {
        clickOn(getApple()); //clicking on apple
    }

        public void loadingLaptop_Computer(){

        clickOn(getLaptop_Computers());
        }

        public void loadingvideo_games_consoles_vrdeals(){

        clickOn(getVideo_Games_Consoles_VRDeals());
        }


    }
