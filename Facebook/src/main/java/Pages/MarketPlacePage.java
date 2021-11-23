package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlacePage extends CommonAPI {

//    Vehicle First

    @FindBy (xpath = "//span[contains(text(),'Vehicles')]")
    WebElement Vehicles;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Boats']")
    WebElement Boats;

    @FindBy (xpath = "//img[@alt='2002 Mercury efi 225 in Far Rockaway, NY']")
    WebElement FirstImageLink;

    @FindBy (xpath = "//div[@class='hlyrhctz']//div[@class='dati1w0a ihqw7lf3 hv4rvrfc discj3wi']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Message']")
    WebElement Message;

//    SearchMarketplace Section Test1

    @FindBy (xpath = "//div[@class='bp9cbjyn j83agx80 hv4rvrfc dati1w0a']//input[@placeholder='Search Marketplace']")
    WebElement SearchMarketplace;

    @FindBy (xpath = "//img[@alt='2014 Honda CR-V in Elmhurst, NY']")
    WebElement FirstListed;

    @FindBy (xpath = "//div[@aria-label='View next image']//i[@class='hu5pjgll m6k467ps']")
    WebElement nextimage;

    @FindBy (xpath = "//div[@class='hlyrhctz']//div[@class='dati1w0a ihqw7lf3 hv4rvrfc discj3wi']//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4']")
    WebElement crvmessage;

//    Property Rentals First

    @FindBy (xpath = "//span[contains(text(),'Property Rentals')]")
    WebElement propertyrentals;

    @FindBy (xpath = "//div[@class='hlyrhctz']//div[@class='hlyrhctz']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Apartments for Rent']")
    WebElement ApartmentsforRent;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='2 Bedroom Apartments']")
    WebElement twoBedroomApartment;

    @FindBy (xpath = "//div[@class='q9uorilb oi9244e8 kkf49tns ku2m03ct']//i[@class='hu5pjgll m6k467ps']")
    WebElement SortBy;

    @FindBy (xpath = "//div[@class='bp9cbjyn j83agx80 btwxx1t3']//div//i[@class='hu5pjgll op6gxeva']")
    WebElement NearestFirst;

//    Electronics

    @FindBy (xpath = "//span[contains(text(),'Electronics')]")
    WebElement Electronics;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Computers']")
    WebElement Computers;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Laptops']")
    WebElement Laptops;

    @FindBy (xpath = "//img[@alt='Hp Laptop 14s-dk0xxx for Sale in Brooklyn, NY']")
    WebElement listing;

//    BBQ Grill Search

    @FindBy (xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v lrazzd5p q66pz984']")
    WebElement location;

    @FindBy (xpath = "//div[@class='dwo3fsh8 g5ia77u1 ow4ym5g4 auili1gw nhd2j8a9 oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 l9j0dhe7 i1ao9s8h du4w35lb rq0escxv oo9gr5id j83agx80 jagab5yi knj5qynh fo6rh5oj lzcic4wl osnr6wyh hv4rvrfc dati1w0a p0x8y401 k4urcfbm']")
    WebElement millage;

    @FindBy (xpath = "//body/div[@id='mount_0_0_jN']/div/div/div[@class='rq0escxv l9j0dhe7 du4w35lb']/div/div/div[@class='__fb-light-mode l9j0dhe7 tkr6xdv7']/div[@class='rq0escxv l9j0dhe7 du4w35lb']/div[@class='j83agx80 cbu4d94t h3gjbzrl l9j0dhe7']/div/div/div[@class='__fb-light-mode']/div[@class='j34wkznp qp9yad78 pmk7jnqg kr520xx4']/div[@class='iqfcb0g7 tojvnm2t a6sixzi8 k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y l9j0dhe7 iyyx5f41 a8s20v7p']/div/div[@role='menu']/div[@class='rq0escxv jgsskzai cwj9ozl2 nwpbqux9 io0zqebd m5lcvass fbipl8qg nwvqtn77 ni8dbmo4 stjgntxs']/div[@class='gs1a9yip fj0cixhj j83agx80 cbu4d94t l9j0dhe7 dd2scrzq ejg0drik']/div[@class='j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1']/div[@class='q5bimw55 rpm2j7zs k7i0oixp gvuykj2m j83agx80 cbu4d94t ni8dbmo4 eg9m0zos l9j0dhe7 du4w35lb ofs802cu pohlnb88 dkue75c7 mb9wzai9 l56l04vs r57mb794 kh7kg01d c3g1iek1 gs1a9yip rq0escxv rz4wbd8a a8nywdso smdty95z c1zf3a5g gu2zta1c k4urcfbm']/div[@class='j83agx80 cbu4d94t buofh1pr l9j0dhe7']/div[@class='tojvnm2t a6sixzi8 k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y l9j0dhe7 iyyx5f41 a8s20v7p']/div[1]/div[1]")
    WebElement fivemile;

    @FindBy (xpath = "//span[contains(text(),'Apply')]")
    WebElement Apply;

    //    search for girls coat in Apparel section
    @FindBy (xpath = "//span[contains(text(),'Apparel')]")
    WebElement Apparel;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a[1]/span[1]/span[1]")
    WebElement KidsClothing;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[1]/span[1]")
    WebElement GirlsClothing;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]/span[1]")
    WebElement GirlsCoats;

//    looking to buy Wardrobe in Home Goods Section

    @FindBy (xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id'][normalize-space()='Home Goods']")
    WebElement HomeGoods;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Furniture']")
    WebElement Furniture;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Bedroom Furniture']")
    WebElement BedroomFurniture;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Wardrobes']")
    WebElement Wardrobes;

    @FindBy (xpath = "//span[contains(text(),'Toys & Games')]")
    WebElement ToysGames;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Puzzles']")
    WebElement puzzlesbutton;

    @FindBy (xpath = "//img[@alt='Puzzles in Bridgewater, NJ']")
    WebElement firstlistingpuzzle;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw taijpn5t bp9cbjyn owycx6da btwxx1t3 kt9q3ron ak7q8e6j isp2s0ed ri5dt5u2 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 hv4rvrfc dati1w0a tdjehn4e tv7at329']")
    WebElement sharepuzzle;

    @FindBy (xpath = "//span[normalize-space()='Copy link']")
    WebElement copypuzzlelink;

//    share marketplace items

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement firstMacbookProListing;

    @FindBy (xpath = "//div[@aria-label='View next image']//i[@class='hu5pjgll m6k467ps']")
    WebElement NextimageofPro;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw taijpn5t bp9cbjyn owycx6da btwxx1t3 kt9q3ron ak7q8e6j isp2s0ed ri5dt5u2 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 hv4rvrfc dati1w0a tdjehn4e tv7at329']//i[@class='hu5pjgll lzf7d6o1']")
    WebElement SharePro;

    @FindBy (xpath = "//span[normalize-space()='Copy link']")
    WebElement CopyProLink;

    //    Scroll down top Popular Category
    @FindBy (xpath = "//span[contains(text(),'Popular Categories')]")
    WebElement PopularCategory;

    @FindBy (xpath = "//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Furniture']")
    WebElement FurniturePopular;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Baby Furniture']")
    WebElement BabyFurniture;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement BabyCrib;

//    Browse BMW cars through Vehicles Category

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Cars']")
    WebElement Cars;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Sedans']")
    WebElement Sedan;

    @FindBy (xpath = "//div[@class='rq0escxv l9j0dhe7 du4w35lb hybvsw6c qbxu24ho bxzzcbxg lxuwth05 h2mp5456 goun2846 ccm00jje s44p3ltw mk2mc5f4 frvqaej8 ed0hlay0 afxsp9o4 jcgfde61 io0zqebd m5lcvass fbipl8qg nwvqtn77 k4urcfbm ni8dbmo4 stjgntxs sbcfpzgs']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'][normalize-space()='Bmw Series 3']")
    WebElement BMW;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement ListingBMW;

//    Finding iphone through searchbar dynamic dropdown

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement iphone;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement iphonelisting;

    @FindBy (xpath = "//span[contains(text(),'Works perfectly')]")
    WebElement iphoneDescriptionText;

//    Samsunc tv with screenshot

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")
    WebElement samsungtv;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[1]/span[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement samsunglisting;

    public WebElement getSamsungtv() {
        return samsungtv;
    }

    public WebElement getSamsunglisting() {
        return samsunglisting;
    }

    public WebElement getIphone() {
        return iphone;
    }

    public WebElement getIphonelisting() {
        return iphonelisting;
    }

    public WebElement getIphoneDescriptionText() {
        return iphoneDescriptionText;
    }

    public WebElement getCars() {
        return Cars;
    }

    public WebElement getSedan() {
        return Sedan;
    }

    public WebElement getBMW() {
        return BMW;
    }

    public WebElement getListingBMW() {
        return ListingBMW;
    }

    public WebElement getPopularCategory() {
        return PopularCategory;
    }

    public WebElement getFurniturePopular() {
        return FurniturePopular;
    }

    public WebElement getBabyFurniture() {
        return BabyFurniture;
    }

    public WebElement getBabyCrib() {
        return BabyCrib;
    }

    public WebElement getFirstMacbookProListing() {
        return firstMacbookProListing;
    }

    public WebElement getNextimageofPro() {
        return NextimageofPro;
    }

    public WebElement getSharePro() {
        return SharePro;
    }

    public WebElement getCopyProLink() {
        return CopyProLink;
    }

    public WebElement getToysGames() {
        return ToysGames;
    }

    public WebElement getPuzzlesbutton() {
        return puzzlesbutton;
    }

    public WebElement getFirstlistingpuzzle() {
        return firstlistingpuzzle;
    }

    public WebElement getSharepuzzle() {
        return sharepuzzle;
    }

    public WebElement getCopypuzzlelink() {
        return copypuzzlelink;
    }

    public WebElement getHomeGoods() {
        return HomeGoods;
    }

    public WebElement getFurniture() {
        return Furniture;
    }

    public WebElement getBedroomFurniture() {
        return BedroomFurniture;
    }

    public WebElement getWardrobes() {
        return Wardrobes;
    }

    public WebElement getApparel() {
        return Apparel;
    }

    public WebElement getKidsClothing() {
        return KidsClothing;
    }

    public WebElement getGirlsClothing() {
        return GirlsClothing;
    }

    public WebElement getGirlsCoats() {
        return GirlsCoats;
    }

    public WebElement getFivemile() {
        return fivemile;
    }

    public WebElement getLocation() {
        return location;
    }

    public WebElement getMillage() {
        return millage;
    }

    public WebElement getApply() {
        return Apply;
    }

    public WebElement getElectronics() {
        return Electronics;
    }

    public WebElement getComputers() {
        return Computers;
    }

    public WebElement getLaptops() {
        return Laptops;
    }

    public WebElement getListing() {
        return listing;
    }

    public WebElement getNearestFirst() {
        return NearestFirst;
    }

    public WebElement getPropertyrentals() {
        return propertyrentals;
    }

    public WebElement getApartmentsforRent() {
        return ApartmentsforRent;
    }

    public WebElement getTwoBedroomApartment() {
        return twoBedroomApartment;
    }

    public WebElement getSortBy() {
        return SortBy;
    }

    public WebElement getSearchMarketplace() {
        return SearchMarketplace;
    }

    public WebElement getNextimage() {
        return nextimage;
    }

    public WebElement getFirstListed() {
        return FirstListed;
    }

    public WebElement getCrvmessage() {
        return crvmessage;
    }

    public WebElement getVehicles() {
        return Vehicles;
    }

    public WebElement getBoats() {
        return Boats;
    }

    public WebElement getFirstImageLink() {
        return FirstImageLink;
    }

    public WebElement getMessage() {
        return Message;
    }

    public void VehicleFirst(){
        clickOn(getVehicles());
        waitFor(2);
        clickOn(getBoats());
        waitFor(2);
        clickOn(getFirstImageLink());
        waitFor(2);
        clickOn(getMessage());
        waitFor(2);


    }

    public void SearchFirst(){
        typeEnter(getSearchMarketplace(), "honda crv");
        waitFor(2);
        clickOn(getFirstListed());
        waitFor(2);
        clickOn(getNextimage());
        waitFor(2);
        clickOn(getCrvmessage());
        waitFor(2);
    }

    public void PropertyRentalFirst(){
        clickOn(getPropertyrentals());
        waitFor(2);
        clickOn(getApartmentsforRent());
        waitFor(2);
        clickOn(getTwoBedroomApartment());
        waitFor(2);
        clickOn(getSortBy());
        waitFor(2);
        clickOn(getNearestFirst());
        waitFor(2);
    }

    public void searchItemOneAfterAnother(String str){typeEnter(getSearchMarketplace(), str);}
    public void clearSearchField(){
        clearTextField(getSearchMarketplace());
    }

    public void laptop(){
        clickOn(getElectronics());
        clickOn(getComputers());
        clickOn(getLaptops());
        clickOn(getListing());
    }

    public void BBQGrill(){
        typeEnter(getSearchMarketplace(), "BBQ Grill");
        waitFor(2);
        clickOn(getLocation());
        waitFor(2);
        clickOn(getMillage());
        waitFor(2);
        hoverOver(driver, getFivemile());
        waitFor(2);
        clickOn(getApply());
        waitFor(2);
    }

    public void GirlsCoats(){
        clickOn(getApparel());
        waitFor(2);
        clickOn(getKidsClothing());
        waitFor(2);
        clickOn(getGirlsClothing());
        waitFor(2);
        clickOn(getGirlsCoats());
        waitFor(2);

    }

    public void Wardrobes(){
        clickOn(getHomeGoods());
        waitFor(2);
        clickOn(getFurniture());
        waitFor(2);
        clickOn(getBedroomFurniture());
        waitFor(2);
        clickOn(getWardrobes());
        waitFor(2);
    }

    public void PuzzleGameShare(){
        clickOn(getToysGames());
        waitFor(2);
        clickOn(getPuzzlesbutton());
        waitFor(2);
        clickOn(getFirstlistingpuzzle());
        waitFor(2);
        clickOn(getSharepuzzle());
        waitFor(2);
        clickOn(getCopypuzzlelink());
        waitFor(2);
    }

    public void ShareMacbookPro(){
        typeEnter(getSearchMarketplace(), "macbook pro");
        waitFor(2);
        clickOn(getFirstMacbookProListing());
        waitFor(2);
        clickOn(getNextimageofPro());
        waitFor(2);
        clickOn(getNextimageofPro());
        waitFor(2);
        clickOn(getNextimageofPro());
        waitFor(2);
        clickOn(getSharePro());
        waitFor(2);
        clickOn(getCopyProLink());
        waitFor(2);

    }

    public void ScrollToPopular(){
        scrollToView(getPopularCategory(), driver);
        waitFor(2);
        clickOn(getFurniturePopular());
        waitFor(2);
        clickOn(getBabyFurniture());
        waitFor(2);
        clickOn(getBabyCrib());
        waitFor(2);
    }

    public void NavigateBackForwardHome(){
        typeEnter(getSearchMarketplace(), "printer");
        waitFor(2);
        navigateBack();
        waitFor(2);
        navigateForward();
        waitFor(2);
        navigateToHomeWindow();
        waitFor(2);
    }

    public void BrowseforBMW(){
        clickOn(getVehicles());
        waitFor(2);
        clickOn(getCars());
        waitFor(2);
        clickOn((getSedan()));
        waitFor(2);
        clickOn(getBMW());
        waitFor(2);
    }

    public void iphoneDescriptionGet(){
        typeInto(getSearchMarketplace(), "iphone");
        waitFor(2);
        clickOn(getIphone());
        waitFor(2);
        clickOn(getIphonelisting());
        waitFor(2);
        clickOn(getNextimage());
        waitFor(2);
        text_for_Elements(getIphoneDescriptionText());
    }

    public void samsungtvscreenshot(){
        typeInto(getSearchMarketplace(), "samsung tv");
        waitFor(2);
        clickOn(getSamsungtv());
        waitFor(2);
        clickOn(getSamsunglisting());
        waitFor(2);
        captureScreenshot();
        waitFor(2);
    }
}