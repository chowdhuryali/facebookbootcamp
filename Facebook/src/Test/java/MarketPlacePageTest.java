import Pages.HomePage;
import Pages.MarketPlacePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MarketPlacePageTest extends CommonAPI {

    //search for honda crv
    @Test
    public void searchbar(){
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homepage.MarketPlace();
        marketPlacePage.SearchFirst();
    }

//    search item one after another
    @Test
    public void searchItemsOneAfterAnother() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        List<String> itemToSearch = new ArrayList<>();
        itemToSearch.add("honda crv");
        itemToSearch.add("laptop");
        itemToSearch.add("sofa set");
        itemToSearch.add("camera");
        itemToSearch.add("dining table");

        for (String item : itemToSearch) {
            marketPlacePage.searchItemOneAfterAnother(item);
            marketPlacePage.clearSearchField();
        }
    }

    //looking for boats
    @Test
    public void VehicleCategory(){
    HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
    homepage.MarketPlace();
    marketPlacePage.VehicleFirst();
    }

//    looking for 2 bedroom appartments
    @Test
    public void PropertyRentalCategory(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        marketPlacePage.PropertyRentalFirst();
    }

//    looking for laptop in Electronics category
    @Test
    public void ElectornicsLaptop(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        marketPlacePage.laptop();
    }

//    search for BBQ Grill within 5 miles
    @Test
    public void BBQGrillSearch(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        marketPlacePage.BBQGrill();
    }


//    lookign to buy GirlsCoats in Apperal Section
    @Test
    public void GirlsCoats(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        marketPlacePage.GirlsCoats();
    }

//    looking to buy wardrobes in Home Goods Section
    @Test
    public void Wardrobes(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MarketPlacePage marketPlacePage = PageFactory.initElements(driver, MarketPlacePage.class);
        homePage.MarketPlace();
        marketPlacePage.Wardrobes();
    }


}
