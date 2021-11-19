package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestGeicoCommercial extends CommonAPI {

    @Test
    public void testingGeicocomm() {
        HomePage geicoadd = PageFactory.initElements(driver,HomePage.class);
        geicoadd.testingCommercial();

    }
}
