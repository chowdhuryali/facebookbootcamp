package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestGetQuote extends CommonAPI {

    @Test
    public void testingGetquote() {
        HomePage homepage = PageFactory.initElements(driver,HomePage.class);
        homepage.testingGetQuote();

    }



}
