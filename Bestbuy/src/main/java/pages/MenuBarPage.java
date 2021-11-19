package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MenuBarPage extends CommonAPI {

        @FindBy(xpath = "//*[@id=\"shop-header-76a4fc95-f542-4851-aa94-093bd054a01f\"]/div/div[1]/header/div[2]/nav/div/ul")
        List<WebElement> MenuBar;

    @FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //exit popup





    @FindBy (linkText = "Top Deals")
    WebElement Top_Deals;

//done
    @FindBy (xpath = "//a[@data-lid='hdr_dotd']")
    WebElement Deal_of_the_day;


    //done
    @FindBy (xpath = "//a[@data-lid='hdr_best_buy_totaltech']")
    WebElement Best_Buy_Tooltech;

    @FindBy (xpath = "//a[@data-lid='hdr_health']")
    WebElement Health_Wellness;


    @FindBy (xpath = "//a[@data-lid= 'hdr_crd' ]")
    WebElement Credit_Card;


//
//    @FindBy(xpath= "//a[@data-lid= 'hdr_topdeals' ]")
//    WebElement Top_Deals;



    public WebElement getTop_Deals() {
        return Top_Deals;
    }

//done
    public WebElement getDeal_of_the_day() {
        return Deal_of_the_day;
    }
//done
    public WebElement getBest_Buy_Tooltech() {
        return Best_Buy_Tooltech;
    }

    public WebElement getHealth_Wellness() {
        return Health_Wellness;
    }

    public WebElement getCredit_Card() {
        return Credit_Card;
    }



        public void getting_All_Text(){
        text_for_Elements(getDeal_of_the_day());
        text_for_Elements(getBest_Buy_Tooltech());
        text_for_Elements(getTop_Deals());
        text_for_Elements(getCredit_Card());
}




    public WebElement getGoodtiding() {
        return goodtiding;
    }

    public List<WebElement> getMenuBar() {
        return MenuBar;
    }





    // pop up cancel
    public void closingpopup(){
        clickOn(getGoodtiding());
    }








    //not done yet include click function dont know
    public List<String> MenuBarElements(){
        List <String> lists = new ArrayList<>();
        List <WebElement> Elements = getMenuBar();
        for (WebElement element : Elements) {

            lists.add(element.getText());


        }
        return lists;
    }




}
