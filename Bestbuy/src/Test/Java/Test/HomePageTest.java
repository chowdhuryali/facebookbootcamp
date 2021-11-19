package Test;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

        @Test
    public void validated_Title_test(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Best Buy | Official Online Store | Shop Now & Save");
    }

        @Test
        public void Printing_Text_Homepage(){
            String titles = driver.getCurrentUrl();
            Assert.assertEquals("https://www.bestbuy.com/", titles);

        }
}
