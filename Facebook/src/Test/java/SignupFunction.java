import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignupFunction extends CommonAPI {
    @Test
    public void signup(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.signup();
    }
}
