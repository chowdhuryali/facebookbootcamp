package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestProtectYourHome extends CommonAPI {

    @Test
    public void protectYourHome() {
        HomePage protecthometips = PageFactory.initElements(driver,HomePage.class);
        protecthometips.protectyourHome();
    }

}
