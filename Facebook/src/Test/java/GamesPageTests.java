import Pages.GamePage;
import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GamesPageTests extends CommonAPI {

    //    looking for top charts game to play
    @Test
    public void GameTopChart() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        GamePage gamePage = PageFactory.initElements(driver, GamePage.class);
        homePage.Games();
        gamePage.GamesFirst();
    }
}