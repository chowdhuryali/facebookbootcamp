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

}
