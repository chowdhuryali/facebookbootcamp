package Test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.searchingbrowser;

import java.util.ArrayList;
import java.util.List;

public class SearchBarTest extends CommonAPI {



    @Test
    public void searchingSamsungTVTest(){
        searchingbrowser search = PageFactory.initElements(driver, searchingbrowser.class);
      // search.clickOn(search.getGoodtiding());
        search.searchItem("samsung tv");
        waitFor(5);



    }


    @Test
    public void searchingAppleTest(){
        searchingbrowser searchApple = PageFactory.initElements(driver, searchingbrowser.class);
       searchApple.clickOn(searchApple.getGoodtiding());
        searchApple.searchItem("Apple");
        waitFor(5);

    }



            //test not done yeeeett
    @Test
    public void searchItems(){
        searchingbrowser search = PageFactory.initElements(driver, searchingbrowser.class);
       // search.closingpopup();
        List<String> searching = new ArrayList<>();
        searching.add("PS5");
        searching.add("Macbook Pro");
        searching.add("Apple Watch");
        searching.add("Call of Duty ");
        searching.add("PC Gaming");

        for (String items: searching) {

            search.searching(items);
            // search.searchingMultipleItems(items);
            search.clickingsearch();
            waitFor(4);
            search.clearSearchField();



        }
    }



}
