package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchPage extends CommonAPI {

    @FindBy (xpath = "//input[@aria-autocomplete='list']")
    WebElement search;

    @FindBy (xpath = "//img[@src='https://scontent-lga3-2.xx.fbcdn.net/v/t15.13418-10/c0.0.400.224a/p75x225/27404914_149367815772799_3808503992791597056_n.jpg?_nc_cat=109&ccb=1-5&_nc_sid=f2c4d5&_nc_ohc=OAj4y0LYbSEAX-U2rVb&_nc_ht=scontent-lga3-2.xx&oh=906aa87d30560895810360347caa11f2&oe=619B7A8A']")
    WebElement firstvideo;

    @FindBy (xpath = "//div[@aria-label=\"Leave a comment\"]")
    WebElement comment;

    @FindBy (xpath = "//div[@class='n851cfcs']")
    WebElement email;

    @FindBy (xpath = "//label[@aria-label=\"Password\"]")
    WebElement password;

    public WebElement getFirstvideo() {
        return firstvideo;
    }

    public WebElement getComment() {
        return comment;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSearch() {
        return search;
    }

    public void WatchSearch(){
        typeEnter(getSearch(), "learn java");
        waitFor(2);
        clickOn(getFirstvideo());
        waitFor(2);
        clickOn(getComment());
        waitFor(2);
        typeInto(getEmail(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getPassword(), "password");
        waitFor(2);

    }
}