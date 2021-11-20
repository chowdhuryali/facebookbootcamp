package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestChatBot extends CommonAPI {

    @Test
    public void testingChat() {
        HomePage chat = PageFactory.initElements(driver,HomePage.class);
        chat.testingChat();
    }
}
