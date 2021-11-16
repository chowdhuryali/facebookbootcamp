import base.CommonAPI;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AmazonTesting extends CommonAPI {


//    public WebDriver driver;
//    static String website = "https://www.Amazon.com/";
//
//    @Before
//
//    public void Upset() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/jawadsyed/IdeaProjects/web-automation-framework/Generic/drivers/chromedriver");
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(website);
//        driver.manage().window().maximize();
//
//
//    }


    @Test

    public void Upseet() throws InterruptedException {


        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys("rtouahri2000@yahoo.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")).sendKeys("ameen@2021");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input")).click();
        Thread.sleep(3000);


    }


//        @After
//        public void after(){
//        driver.quit();
//        }

    }





