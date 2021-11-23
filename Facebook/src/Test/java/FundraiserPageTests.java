import Pages.FundraisersPage;
import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FundraiserPageTests extends CommonAPI {

    @Test
    public void RaiseMoney(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FundraisersPage fundraisersPage = PageFactory.initElements(driver, FundraisersPage.class);
        homePage.Fundraiser();
        fundraisersPage.raisemoney();
    }

    @Test
    public void DonateMoney(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FundraisersPage fundraisersPage = PageFactory.initElements(driver, FundraisersPage.class);
        homePage.Fundraiser();
        fundraisersPage.donate();
    }
}