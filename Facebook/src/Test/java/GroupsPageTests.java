import Pages.GroupsPage;
import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GroupsPageTests extends CommonAPI {

//    looking for groups to join in Blockchain Group
    @Test
    public void JoinBlockchainGroup(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        GroupsPage groupsPage = PageFactory.initElements(driver, GroupsPage.class);
        homePage.Groups();
        groupsPage.GroupFirst();
    }
}
