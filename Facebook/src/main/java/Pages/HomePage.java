package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[@title='Sign Up for Facebook']")
    WebElement signup;

    @FindBy (xpath = "//a[@title='Browse our Watch videos.']")
    WebElement Watch;

    @FindBy (xpath = "//a[@title='Buy and sell on Facebook Marketplace.']")
    WebElement marketplace;

    @FindBy (xpath = "//a[@title='Check out Facebook games.']")
    WebElement Games;

    @FindBy (xpath = "//a[@title='Check out popular places on Facebook.']")
    WebElement Places;

    @FindBy (xpath = "//a[@title='Explore our Groups.']")
    WebElement Groups;

    @FindBy (xpath = "//a[@title='Apply for jobs and hire on Facebook.']")
    WebElement Jobs;

    @FindBy (xpath = "//a[@title='Donate to worthy causes.']")
    WebElement Fundraisers;

    public WebElement getFundraisers() {
        return Fundraisers;
    }

    public WebElement getJobs() {
        return Jobs;
    }

    public WebElement getGroups() {
        return Groups;
    }

    public WebElement getPlaces() {
        return Places;
    }

    public WebElement getGames() {
        return Games;
    }

    public WebElement getMarketplace() {
        return marketplace;
    }

    public WebElement getWatch() {
        return Watch;
    }

    public WebElement getSignup() {
        return signup;
    }


    public void signup() {clickOn(getSignup());}

    public void watch(){
        clickOn(getWatch());
    }

    public void MarketPlace(){clickOn(getMarketplace());}

    public void Games(){clickOn(getGames());}

    public void Places(){clickOn(getPlaces());}

    public void Groups(){clickOn(getGroups());}

    public void Jobs(){clickOn(getJobs());}

    public void Fundraiser(){clickOn(getFundraisers());}


}