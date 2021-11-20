package Test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ClickingHomePageLinks;

public class HomePageLinkTest extends CommonAPI {







    @Test
    public void ClickingAppleTest(){
       ClickingHomePageLinks apple = PageFactory.initElements(driver, ClickingHomePageLinks.class);
       apple.closingpopup();
       apple.loadingApple();
        waitFor(5);
    }

    @Test
    public void ClickingLaoptop_ComputerTest(){
        ClickingHomePageLinks laptop_computer = PageFactory.initElements(driver,ClickingHomePageLinks.class);
       laptop_computer.closingpopup();
        laptop_computer.loadingLaptop_Computer();
        waitFor(5);
    }

    @Test
    public void clickVideo_Games_Consoles_VRDealsTest(){
        ClickingHomePageLinks VideoGamesConsolesVRDeals = PageFactory.initElements(driver,ClickingHomePageLinks.class);
       VideoGamesConsolesVRDeals.closingpopup();
        VideoGamesConsolesVRDeals.loadingvideo_games_consoles_vrdeals();
        waitFor(5);


    }
}
