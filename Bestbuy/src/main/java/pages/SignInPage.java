package pages;


import base.CommonAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends CommonAPI {


    @FindBy (xpath = "//button[@class='c-close-icon c-modal-close-icon']")
    WebElement goodtiding; //exit popup





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






    public WebElement getGoodtiding() {
        return goodtiding;      //pop up cancel
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











                // pop up cancel
    public void closingpopup(){
       clickOn(getGoodtiding());
    }


        //invalid username/password login in
    public void AccountSignIn(){


        clickOn(getClickingAccount());
        waitFor(2);
        clickOn(getSignin());
        waitFor(2);
        clickOn(getUsername());
        waitFor(2);
        typeInto(getUsername(),"syedjawad1923@gmail.com");
        waitFor(2);
        clickOn(getPassword());
        waitFor(2);
        typeEnter(getPassword(),"yeetyouthought");
        waitFor(3);

    }
        public void AccountSignInInvalidPassword(){

        clickOn(getClickingAccount());
        waitFor(2);
        clickOn(getSignin());
        waitFor(2);
        clickOn(getUsername());
        waitFor(2);
        typeInto(getUsername(), "Jawadsyedofficial23@gmail.com");
        waitFor(2);
        clickOn(getPassword());
        waitFor(2);
        typeEnter(getPassword(), "nahyougotmyemailbutnotpassword");

        waitFor(2);





        }





}




