package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AccountLoginPage;

public class TestAccountLogin extends CommonAPI {

    @Test
    public void testingAccountlogin() {
        AccountLoginPage accountlogin = PageFactory.initElements(driver,AccountLoginPage.class);
        accountlogin.testingAccountLogin();
    }
}
