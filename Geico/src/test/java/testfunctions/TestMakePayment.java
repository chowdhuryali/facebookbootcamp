package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestMakePayment extends CommonAPI {

    @Test
    public void testingMakepayment() {
        HomePage homepage = PageFactory.initElements(driver,HomePage.class);
        homepage.testMakeapayment();
    }

}
