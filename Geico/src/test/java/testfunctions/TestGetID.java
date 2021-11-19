package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestGetID extends CommonAPI {

    @Test
    public void testingGetID() {
        HomePage homepage = PageFactory.initElements(driver,HomePage.class);
        homepage.testingGetID();

    }


}
