package pages;

import base.CommonAPI;
import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class MenuDropDownPage extends CommonAPI {


    @FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //exit popup


    @FindBy(partialLinkText= "Menu")
   WebElement clickingMenu;


    @FindBy(className = "hamburger-menu-flyout-list")
    WebElement Menudropdownlist; //all the items in the menu









    public WebElement getGoodtiding() {
        return goodtiding;
    }

    public WebElement getClickingMenu() {
        return clickingMenu;
    }

    public WebElement getMenudropdownlist() {
        return Menudropdownlist;
    }






    // pop up cancel
    public void closingpopup(){
        clickOn(getGoodtiding());
    }


    public void clickingmenuicon(){
        clickOn(getClickingMenu());
    }



    public void gettingtextfromdropdown(){
        closingpopup();
        clickingmenuicon();
        text_for_Elements(getMenudropdownlist());


    }
        public void SelectingMultipleList(){



        }




        @Test
        public void thiswillwork(String o){
        List <WebElement> pc = new ArrayList<>();
        pc.add(getMenudropdownlist());




            for (WebElement p : pc ) {
                System.out.println(p);
            }



        }




}
