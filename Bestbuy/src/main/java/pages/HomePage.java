package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //click method


    @FindBy (xpath = "//span[@class='plButton-label v-ellipsis']")
    WebElement ClickingAccount;

    @FindBy (xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
    WebElement Signin;


    @FindBy (xpath = "//input[@id='fld-e']")
    WebElement Username;


    @FindBy (xpath = "//input[@id='fld-p1']")
    WebElement Password;


    @FindBy (xpath = "//button[@type='submit']")
    WebElement SubmitSignInButton;

    @FindBy (linkText = "Apple")
    WebElement Apple;       //clicking apple on homepage

    @FindBy (id="gh-search-input") //use typeAndEnter method
    WebElement SearchItem;  //searching item

    @FindBy (xpath ="//div[@class='hamburger-menu-flyout']") //use arraylist
    WebElement MenuDroplist;        //drop down list for menu title



    @FindBy (xpath = "//ul[@class='bottom-nav-left']")
    List<WebElement> MenuBar; //homepage menubar use arraylist to search each items and click


=======

public class HomePage extends CommonAPI {

>>>>>>> a8a2f759f1718ddc79e3660bccf18d219d1b03d9


    @FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //exit popup



    public WebElement getGoodtiding() {
        return goodtiding;
    }

<<<<<<< HEAD
//DONE
    public WebElement getApple() {

        return Apple;
    }

//Done
    public WebElement getSearchItem() {
        return SearchItem;
    }


    public WebElement getMenuDropDown() {
        return MenuDroplist;
    }




    public WebElement getClickingAccount() {
        return ClickingAccount;
    }
    public WebElement getSignin() {
        return Signin;
    }

    public WebElement getUsername() {
        return Username;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getSubmitSignInButton() {
        return SubmitSignInButton;
    }

    public List<WebElement> getMenuBar() {
        return MenuBar;
    }



        public void doingsomethingg(){

        typeEnter(getPassword(),"reload");
        waitFor(2);

        }




                // pop up cancel
=======
    // pop up cancel
>>>>>>> a8a2f759f1718ddc79e3660bccf18d219d1b03d9
    public void closingpopup(){
        clickOn(getGoodtiding());
    }






}
