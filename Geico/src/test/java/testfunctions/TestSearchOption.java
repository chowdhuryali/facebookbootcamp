package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchOptionPage;

public class TestSearchOption extends CommonAPI {

    @Test
    public void testingSearchoption() {

        SearchOptionPage searchoptionpage = PageFactory.initElements(driver,SearchOptionPage.class);
        searchoptionpage.testingSearch();
    }

    @Test
    public void testingSearch2() {

        SearchOptionPage searchtext = PageFactory.initElements(driver,SearchOptionPage.class);
        searchtext.searchGEICO();
    }

    @Test
    public void testingSearch3() {

        SearchOptionPage searchcontact = PageFactory.initElements(driver,SearchOptionPage.class);
        searchcontact.testingContactus();
    }

    @Test
    public void testingSearch4() {

        SearchOptionPage searchagent = PageFactory.initElements(driver,SearchOptionPage.class);
        searchagent.testingSearchbar();
    }

}
