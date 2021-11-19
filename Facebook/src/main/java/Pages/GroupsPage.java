package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroupsPage extends CommonAPI {

    @FindBy (xpath = "//span[contains(text(),'New York, New York')]")
    WebElement NewYork;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw jifvfom9 gs1a9yip lhclo0ds btwxx1t3 cxgpxx05 dlv3wnog rl04r1d5 enqfppq2 muag1w35']//div[1]//a[1]")
    WebElement Blockchain;

    @FindBy (xpath = "//a[@aria-label='DOGECOIN 2.0']//img[@alt='May be an image of text']")
    WebElement DogeCoin;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 cbu4d94t pfnyh3mw d2edcug0 ri2l8tne ph5uu5jm b3onmgus e5nlhep0 ecm0bbzt gloz99to r516eku6 k83vx86k']//div//div//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Join group']")
    WebElement JoinGroup;

    public WebElement getNewYork() {
        return NewYork;
    }

    public WebElement getBlockchain() {
        return Blockchain;
    }

    public WebElement getDogeCoin() {
        return DogeCoin;
    }

    public WebElement getJoinGroup() {
        return JoinGroup;
    }

    public void GroupFirst(){
        clickOn(getNewYork());
        clickOn(getBlockchain());
        clickOn(getDogeCoin());
        clickOn(getJoinGroup());
    }
}


