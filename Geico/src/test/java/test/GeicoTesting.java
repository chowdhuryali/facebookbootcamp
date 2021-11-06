package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GeicoTesting {

    public WebDriver driver;

    @Before

    @Test
    public void Upset() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/chowdhuryahmed/IdeaProjects/Web-Automation-Framework3/Generic/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.geico.com/");
        driver.manage().window().maximize();

        //Click on checkbox selecting Auto insurance service
        driver.findElement(By.xpath("//div[@data-product='auto']")).click();
        Thread.sleep(3000);

        //Click on Start my quote to open a popup window
        driver.findElement(By.xpath("//*[@id=\"bundleModalBtn\"]/p/a")).click();
        Thread.sleep(3000);

        //Click on 5-Digit ZIP field to select
        driver.findElement(By.xpath("//div[@class='zip-holder']")).click();
        Thread.sleep(3000);

        //Enter the zip code in ZIP field
        driver.findElement(By.xpath("//input[@aria-label='5-Digit ZIP']")).sendKeys("92374");
        Thread.sleep(3000);

        //Click on Continue button to open up next window
        driver.findElement(By.xpath("//*[@id=\"bundle_modal\"]/div/div[2]/form/div[3]/input")).click();
        Thread.sleep(3000);

        //Enter the first name
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[2]/div/input")).sendKeys("Chowdhury");
        Thread.sleep(3000);

        //Enter the Last name
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[3]/div/input")).sendKeys("Ahmed");
        Thread.sleep(3000);

        //Exit the browser
        driver.close();
    }

    @After
    public void after () {
        driver.quit();
    }
}


