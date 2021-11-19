package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchingbrowser extends CommonAPI {


    @FindBy(id="gh-search-input") //search eleement
    WebElement SearchItem;


    @FindBy (xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //click method





    //==================== GET METHODS=================================

    public WebElement getSearchItem() {
        return SearchItem;
    }


    public WebElement getGoodtiding() {
        return goodtiding;
    }








//=====================METHODS===========================
    // pop up cancel
    public void closingpopup(){
        clickOn(getGoodtiding());
    }



    //entering multiple search along with clearing the search bad
    public void searchingMultipleItems(String srt){
        typeEnter(getSearchItem(),srt);

    }



    //entering item in the search bar
    public void searchItem(String srt){
      clickOn(getSearchItem());
        typeEnter(getSearchItem(), srt);
    }

    public void searching(String str){
        typeEnter(getSearchItem(), str);
    }
    public void clearSearchField(){
        clearTextField(getSearchItem());

    }



    public void clickingsearch(){

        clickOn(getSearchItem());

    }




    //clearing search bar
    public void ClearingSearch(){
        clickandclear(getSearchItem());
    }








}
