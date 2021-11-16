package Test;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class SearchItems extends CommonAPI {

//homepage.clickOn(homepage.getGoodtiding()); //use this to cancel first pop-up
//     homePage.closingpopup();

        @Test
    public void doingsomethingpractice(){
        HomePage homepage = PageFactory.initElements(driver,HomePage.class);

       homepage.doingsomethingg();

    }




    @Test
    public void searchingSamsungTV(){
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.clickOn(homepage.getGoodtiding());
        homepage.searchItem("samsung tv");
        waitFor(5);

    }


    @Test
    public void MenuElements(){
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        for (String elements : homePage.getMenuBarElements()) {
            System.out.println(elements);
        }
    }

    @Test
    public void ClickingApple(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.closingpopup();
        homePage.loadingApple();
        waitFor(5);
    }
            //Fix this code, error is made because search not entering
            @Test
    public void searchItems(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.closingpopup();
        List<String> searching = new ArrayList<>();
        searching.add("PS5");
                waitFor(4);
        searching.add("Macbook Pro");
                waitFor(4);
        searching.add("Apple Watch");
                waitFor(4);
        searching.add("Call of Duty ");
                waitFor(4);
        searching.add("PC Gaming");

        for (String items: searching) {
            homePage.searchingMultipleItems(items);
           waitFor(4);

            homePage.ClearingSearch();
            homePage.Enter(homePage.getSearchItem());

        }
    }




    @Test
    public void LoginIn(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.closingpopup();
        homePage.AccountSignIn();

    }



}
