import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BestBuyTesting {


    public WebDriver driver;

    @Before
    @Test
    public void Upset() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jawadsyed/IdeaProjects/JawadSeleniumProject/src/Drive/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.BestBuy.com/");
        driver.manage().window().maximize();

        driver.close();


    }




    @After
    public void after () {
        driver.quit();
    }
}






