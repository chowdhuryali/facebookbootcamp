import Pages.HomePage;
import Pages.WatchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WatchPageFunction extends CommonAPI {
    @Test
            public void watchsearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        WatchPage watchPage = PageFactory.initElements(driver, WatchPage.class);
        homePage.watch();
        watchPage.WatchSearch();
    }

}
