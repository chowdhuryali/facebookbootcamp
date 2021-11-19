import Pages.HomePage;
import Pages.PlacesPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PlacesPageTests extends CommonAPI {

    // looking for places to eat
    @Test
    public void PlacesSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        PlacesPage placesPage = PageFactory.initElements(driver, PlacesPage.class);
        homePage.Places();
        placesPage.PlacesFirst();
    }

    @Test
    public void MiamiHotel() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        PlacesPage placesPage = PageFactory.initElements(driver, PlacesPage.class);
        homePage.Places();
        placesPage.MiamiHotel();
    }

    @Test
    public void DhakaLakePageLike(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        PlacesPage placesPage = PageFactory.initElements(driver, PlacesPage.class);
        homePage.Places();
        placesPage.DhanmodiLakeLike();
    }

    @Test
    public void GetWebText(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        PlacesPage placesPage = PageFactory.initElements(driver, PlacesPage.class);
        homePage.Places();
        placesPage.GetText();
    }
}


