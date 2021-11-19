package Test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuBarPage;
public class MenuBarTest extends CommonAPI {




    @Test
    public void MenuElements(){
       MenuBarPage MenuBar = PageFactory.initElements(driver, MenuBarPage.class);
       MenuBar.closingpopup();
      MenuBar.getting_All_Text();

    }

}
