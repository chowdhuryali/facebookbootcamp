import base.CommonAPI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BestBuyTesting extends  CommonAPI {


    public WebDriver driver;

    @Before

    public void Upset() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jawadsyed/IdeaProjects/JawadSeleniumProject/src/Drive/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.BestBuy.com/");
        driver.manage().window().maximize();
        Ads ads = new Ads();


    }
    @Test
    public void CartItem() throws InterruptedException {

        this.tabsad();

        WebElement cart = driver.findElement(By.linkText("Apple"));
        cart.click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Apple - Magic Keyboard for 12.9-inch iPad Pro (3rd Generation 2018) (4th Generation)")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Apple - Magic Keyboard ")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button [@class= 'c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")).click();
        Thread.sleep(1000);
        WebElement carting = driver.findElement(By.partialLinkText("Go to Cart"));
        carting.click();


    }



    //cancelling the first tab

    public void tabsad() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class='c-close-icon c-modal-close-icon']")).click();
        Thread.sleep(200);

    }

    //cancelling survey
    public void tabsad2() throws InterruptedException {
        driver.findElement(By.id("survey_invite_no")).click();
        Thread.sleep(200);


    }
        @Test
    public void SearchItem() throws InterruptedException {

        this.tabsad();
     WebElement  search =   driver.findElement(By.id("gh-search-input"));
     search.click();
     search.sendKeys("samsung tv");
     Thread.sleep(500);

     WebElement searchclicking = driver.findElement(By.xpath("//span[@class='header-search-icon']"));
     searchclicking.click();
     Thread.sleep(500);



    }







    @Test
            //MenuListTesting
    public void MenuTesting() throws InterruptedException {

        this.tabsad();
        WebElement menu =  driver.findElement(By.xpath("//button[@aria-label='Menu']"));
        menu.click();;
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@data-id='node-35']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@data-id='node-65']")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-89']")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-96']")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-199']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-404']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-473']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-529']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-601']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-684']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-726']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-762']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@data-id='node-819']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-916']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-982']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-1024']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-1091']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-1158']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-1233']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//button[@data-id='node-1265']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hamburger-back-button")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.id("Close_Cancel_Line")).click();
        Thread.sleep(1000);
    }



       @Test
    public void signin() throws InterruptedException {


       this.tabsad();


        WebElement Account = driver.findElement(By.xpath("//span[@class='plButton-label v-ellipsis']"));
        Account.click();
        Thread.sleep(1000);

        WebElement signingin = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']"));
        signingin.click();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//input[@id='fld-e']"));
        email.sendKeys("jawadsyedofficial23@gmail.com");

        WebElement Password = driver.findElement(By.xpath("//input[@id='fld-p1']"));
        Password.click();
        Password.sendKeys("Pagedown1");


        WebElement submitting = driver.findElement(By.xpath("//button[@type='submit']"));
        submitting.click();
        Thread.sleep(1000);


    }

    @Test
            public void testinghometab() throws InterruptedException {


        this.tabsad();
        WebElement TopDeals = driver.findElement(By.xpath("//a[@data-lid='hdr_topdeals']"));
        TopDeals.click();
        Thread.sleep(500);

        WebElement DealofDay = driver.findElement(By.xpath("//a[@data-lid='hdr_dotd']"));
        DealofDay.click();
        Thread.sleep(500);

        WebElement Tooltech = driver.findElement(By.xpath("//a[@data-lid='hdr_best_buy_totaltech']"));
        Tooltech.click();
        Thread.sleep(500);

        WebElement healthWellness = driver.findElement(By.xpath("//a[@data-lid='hdr_health']"));
        healthWellness.click();
        Thread.sleep(500);




            }



        @After
        public void after () {
           driver.quit();
        }
    }





