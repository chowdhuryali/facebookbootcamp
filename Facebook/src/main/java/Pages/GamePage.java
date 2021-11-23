package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamePage extends CommonAPI {

    @FindBy (xpath = "//li[normalize-space()='Top Charts']")
    WebElement topchart;

    @FindBy (xpath = "//div[@id='u_4_6_+s']//div[@class='_5cfc']")
    WebElement firstlisted;

    @FindBy (xpath = "//button[@value='1']")
    WebElement playnow;

    @FindBy (xpath = "//button[@value='1']")
    WebElement email;

    @FindBy (xpath = "//input[@id='pass']")
    WebElement password;

    public WebElement getTopchart() {
        return topchart;
    }

    public WebElement getFirstlisted() {
        return firstlisted;
    }

    public WebElement getPlaynow() {
        return playnow;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public void GamesFirst(){
        clickOn(getTopchart());
        clickOn(getFirstlisted());
        clickOn(getPlaynow());
        typeInto(getEmail(), "alichy123@gmail.com");
        typeInto(getPassword(), "password");
    }
}