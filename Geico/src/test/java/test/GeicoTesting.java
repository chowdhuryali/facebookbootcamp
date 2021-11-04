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
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@data-product='auto']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"bundleModalBtn\"]/p/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='zip-holder']")).click();
        Thread.sleep(3000);

    }

    @After
    public void after () {
        driver.quit();
    }
}


