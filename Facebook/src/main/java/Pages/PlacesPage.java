package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacesPage extends CommonAPI {

//    @FindBy (xpath = "//input[@placeholder='City name']")
//    WebElement search;
//
//    @FindBy (xpath = "//span[normalize-space()='Albany, New York']")
//    WebElement dropdown;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 cbu4d94t pfnyh3mw d2edcug0 bp9cbjyn rs0gx3tq dicw6rsg']//div//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]")
    WebElement firstlisted;

    @FindBy (xpath = "//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 ofv0k9yr hv4rvrfc dati1w0a aodizinl']//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v b1v8xokw q66pz984'][normalize-space()='Eat']")
    WebElement Eat;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/tribecaskitchen/']//img[@class='k4urcfbm bixrwtb6 datstx6m']")
    WebElement firstlistedr;

    @FindBy (xpath = "//button[normalize-space()='Start Order']")
    WebElement startorddr;

//    looking for Hotels in Miami Florida
    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 cbu4d94t pfnyh3mw d2edcug0 bp9cbjyn rs0gx3tq dicw6rsg']//div[2]//div[3]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]")
    WebElement Miami;

    @FindBy (xpath = "//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 ofv0k9yr hv4rvrfc dati1w0a aodizinl']//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v b1v8xokw m9osqain'][normalize-space()='Hotels']")
    WebElement Hotel;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/NovotelMiami/']//img[@class='k4urcfbm bixrwtb6 datstx6m']")
    WebElement firsthotellisting;

    @FindBy (xpath = "//span[normalize-space()='Reviews']")
    WebElement reviewsofhotel;

//    like pages of Dhanmondi Lake Dhaka

    @FindBy (xpath = "//input[@placeholder='City name']")
    WebElement placesSearh;

    @FindBy (xpath = "//span[normalize-space()='Dhaka, Bangladesh']")
    WebElement selectDhaka;

    @FindBy (xpath = "//div[@class='bp9cbjyn rq0escxv j83agx80 pfnyh3mw frgo5egb l9j0dhe7 ofv0k9yr hv4rvrfc dati1w0a aodizinl']//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v b1v8xokw m9osqain'][normalize-space()='Outdoor']")
    WebElement DhakaOutdoor;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/DhanmondiLakeBD/']//img[@class='k4urcfbm bixrwtb6 datstx6m']")
    WebElement DhanmondiLakePage;

    @FindBy (xpath = "//i[@class='_3-8_ img sp__GhauiEHSVJ_2x sx_8998af']")
    WebElement LikeDhanmondiLake;

//    getText

    @FindBy (xpath = "//span[normalize-space()='Philadelphia, Pennsylvania']")
    WebElement Philadelphia;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]/img[1]")
    WebElement FirstRestaurantListingPL;

    @FindBy (xpath = "//span[normalize-space()='Reviews']")
    WebElement ReveiwButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/p[1]")
     WebElement ReviewText;

    public WebElement getPhiladelphia() {
        return Philadelphia;
    }

    public WebElement getFirstRestaurantListingPL() {
        return FirstRestaurantListingPL;
    }

    public WebElement getReveiwButton() {
        return ReveiwButton;
    }

    public WebElement getReviewText() {
        return ReviewText;
    }

    public WebElement getPlacesSearh() {
        return placesSearh;
    }

    public WebElement getSelectDhaka() {
        return selectDhaka;
    }

    public WebElement getDhakaOutdoor() {
        return DhakaOutdoor;
    }

    public WebElement getDhanmondiLakePage() {
        return DhanmondiLakePage;
    }

    public WebElement getLikeDhanmondiLake() {
        return LikeDhanmondiLake;
    }

    public WebElement getMiami() {
        return Miami;
    }

    public WebElement getHotel() {
        return Hotel;
    }

    public WebElement getFirsthotellisting() {
        return firsthotellisting;
    }

    public WebElement getReviewsofhotel() {
        return reviewsofhotel;
    }

    public WebElement getFirstlistedr() {
        return firstlistedr;
    }

    public WebElement getFirstlisted() {
        return firstlisted;
    }

    public WebElement getStartorddr() {
        return startorddr;
    }

    public WebElement getEat() {
        return Eat;
    }

//    public WebElement getSearch() {
//        return search;
//    }
//
//    public WebElement getDropdown() {
//        return dropdown;
//    }

    public void PlacesFirst(){
        clickOn(getFirstlisted());
        clickOn(getEat());
        clickOn(getFirstlistedr());
        clickOn(getStartorddr());
//        typeInto(getSearch(), "Albany");
//        waitFor(2);
//        hoverOver(driver, getDropdown());
//        waitFor(2);
//        clickOn(getDropdown());

    }

    public void MiamiHotel(){
        clickOn(getMiami());
        waitFor(2);
        clickOn(getHotel());
        waitFor(2);
        clickOn(getFirsthotellisting());
        waitFor(2);
        clickOn(getReviewsofhotel());
        waitFor(2);
    }

    public void DhanmodiLakeLike(){
        typeInto(getPlacesSearh(), "Dhaka");
        waitFor(2);
        clickOn(getSelectDhaka());
        waitFor(2);
        clickOn(getDhakaOutdoor());
        waitFor(2);
        clickOn(getDhanmondiLakePage());
        waitFor(2);
        clickOn(getLikeDhanmondiLake());
        waitFor(2);
    }

    public void GetText(){
        clickOn(getPhiladelphia());
        waitFor(2);
        clickOn(getFirstRestaurantListingPL());
        waitFor(2);
        clickOn(getReveiwButton());
        waitFor(2);
        text_for_Elements(getReviewText());
        waitFor(2);

    }
}
