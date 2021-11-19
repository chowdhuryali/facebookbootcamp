import Pages.HomePage;
import Pages.SignupPage;
import base.CommonAPI;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignupFunction extends CommonAPI {

//    try to signup
    @Test
    public void SignupTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
        homePage.signup();
        signupPage.signup();

    }
}
