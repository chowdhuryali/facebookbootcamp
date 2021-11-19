package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestSavingMoney extends CommonAPI {

    @Test
    public void testingsavingMoney() {
        HomePage savingsmoney = PageFactory.initElements(driver,HomePage.class);
        savingsmoney.testingSavingmoney();

    }
}
