import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AmazonTesting {


    public WebDriver driver;

    @Before
    @Test

    public void Upset() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rtoua\\IdeaProjects\\Web-Automation-Framework3\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

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

        driver.close();


    }
}
