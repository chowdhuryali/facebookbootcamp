package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuOptionPage;

public class TestMenuOption extends CommonAPI {

    @Test
    public void testingMenuoption() {
        MenuOptionPage testingmenu = PageFactory.initElements(driver, MenuOptionPage.class);
        testingmenu.testingMenuoption();
    }

}
