package Test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuDropDownPage;

public class MenuDropDownTest extends CommonAPI {

        @Test
    public void Menu_DropDownList_Text_Test(){
        MenuDropDownPage dropdown = PageFactory.initElements(driver, MenuDropDownPage.class);
        dropdown.closingpopup();
       dropdown.clickingmenuicon();
       dropdown.SelectingMultipleList();




    }

        @Test
        public void MenuDropDownTextTest(){
            MenuDropDownPage MenuDropDownTest = PageFactory.initElements(driver, MenuDropDownPage.class);

            MenuDropDownTest.gettingtextfromdropdown();


        }



}
