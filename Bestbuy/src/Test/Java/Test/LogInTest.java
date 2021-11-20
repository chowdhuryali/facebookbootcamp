package Test;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SignInPage;

public class LogInTest extends CommonAPI {

//homepage.clickOn(homepage.getGoodtiding()); //use this to cancel first pop-up
//     homePage.closingpopup();





    /*
    Invalid username/password
     */
    @Test
    public void LoginIn_invalid_user_and_password_Test(){
        SignInPage Loginin = PageFactory.initElements(driver, SignInPage.class);
       Loginin.closingpopup();
        Loginin.AccountSignIn();


    }



    /*
    Invalid Password
     */
    @Test
    public void login_invalid_password_Test(){
        SignInPage login = PageFactory.initElements(driver, SignInPage.class);
        login.closingpopup();
        login.AccountSignInInvalidPassword();
    }
}
