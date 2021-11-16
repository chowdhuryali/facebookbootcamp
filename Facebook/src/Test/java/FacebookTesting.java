import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class FacebookTesting extends CommonAPI {


    @Test
    //    GetTitle
    public void test1() throws InterruptedException {
        String title = driver.getTitle();
        Assert.assertEquals("Success!!", "Facebook - Log In or Sign Up", title);
        Thread.sleep(3000);
    }

    @Test
    //      Signup
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Ali");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Chowdhury");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("alichowdhury@aol.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input")).sendKeys("alichowdhury@aol.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("password");
        Select drpdown = new Select(driver.findElement(By.id("month")));
        drpdown.selectByVisibleText("Jan");
        Thread.sleep(1000);
        Select drpdown1 = new Select(driver.findElement(By.id("day")));
        drpdown1.selectByVisibleText("5");
        Thread.sleep(1000);
        Select drpdown2 = new Select(driver.findElement(By.id("year")));
        drpdown2.selectByVisibleText("1985");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
        Thread.sleep(7000);


        //      Already Have Account
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("alichowdhury");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pass")).sendKeys("password");
        Thread.sleep(1000);


        //      Forgot Account?
        driver.findElement(By.cssSelector("#login_link > div._97w3 > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("identify_email")).sendKeys("3476585373");
        Thread.sleep(1000);

    }

    @Test
    //    Sign-in
    public void test3() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(3000);
    }

    @Test
    //     Find Software Quality Assurance Engineer Jobs
    public void test4() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/ul/li[10]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div/div/label/input")).sendKeys("Software Quality Assurance Engineer");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/ul/li/div/div[1]/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div[3]/div/div/div/div/div[3]/span/div[3]/div/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div[3]/div/div/div/div/div[4]/div/div[1]/div/div[1]/div/span/span")).click();
        Thread.sleep(7000);

    }

    @Test
//        Search in Marketplace
    public void test5() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/ul/li[8]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[2]/div/div/div[6]/div/a/div[1]/div[2]/div/div/div/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div/div/div[2]/div[2]/div/a/span/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div/div/div[2]/div[5]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div/div/div[2]/div[8]/div/a/span/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[1]/div/span/div/div/a/div/div[1]/div/div/div/div/div/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/span/div/div/div[1]")).click();
        Thread.sleep(7000);
    }

    @Test
//    Discover Places
    public void test6() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/ul/li[6]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input")).sendKeys("New York");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div/div/span")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/span/span")).click();
        Thread.sleep(7000);


    }

    @Test
//        change language to Bangla
    public void test7() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/ul/li[12]/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/table/tbody/tr/td[4]/ul/li[5]/div/a")).click();
        Thread.sleep(10000);


        driver.close();

    }
}









