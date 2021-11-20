package testfunctions;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuOptionPage;

public class TestMenuOption extends CommonAPI {

    @Test
    public void testingMenuoption() {
        MenuOptionPage testingmenu = PageFactory.initElements(driver, MenuOptionPage.class);
        testingmenu.testingMenuoption();
    }

    @Test
    public void testingMenuProperty() {
        MenuOptionPage testingpropins = PageFactory.initElements(driver, MenuOptionPage.class);
        testingpropins.testingPropertyinsurance();
    }

    @Test
    public void testingMenuhomeowners() {
        MenuOptionPage testinghomeowners = PageFactory.initElements(driver, MenuOptionPage.class);
        testinghomeowners.testingHomeowners();
    }

    @Test
    public void testingRenters() {
        MenuOptionPage testingrenters = PageFactory.initElements(driver, MenuOptionPage.class);
        testingrenters.testingRenters();
    }

    @Test
    public void testingCondo() {
        MenuOptionPage testingcondocoop = PageFactory.initElements(driver, MenuOptionPage.class);
        testingcondocoop.testingCondo();
    }

    @Test
    public void testingmobileHome() {
        MenuOptionPage testingmobilehome = PageFactory.initElements(driver, MenuOptionPage.class);
        testingmobilehome.mobileHome();
    }

    @Test
    public void testingLandlord() {
        MenuOptionPage testinglandlord = PageFactory.initElements(driver, MenuOptionPage.class);
        testinglandlord.landLord();
    }

    @Test
    public void testingFlood() {
        MenuOptionPage testingflood = PageFactory.initElements(driver, MenuOptionPage.class);
        testingflood.flood();
    }

    @Test
    public void testingMotorcycle() {
        MenuOptionPage testingmcycle = PageFactory.initElements(driver, MenuOptionPage.class);
        testingmcycle.testingMotorcycle();
    }

    @Test
    public void testingaTV() {
        MenuOptionPage testingatv = PageFactory.initElements(driver, MenuOptionPage.class);
        testingatv.testingAtv();
    }

    @Test
    public void testingRV() {
        MenuOptionPage testingrv = PageFactory.initElements(driver, MenuOptionPage.class);
        testingrv.testingRV();
    }

    @Test
    public void testingBoat() {
        MenuOptionPage testingboat = PageFactory.initElements(driver, MenuOptionPage.class);
        testingboat.testingBoat();
    }
}
