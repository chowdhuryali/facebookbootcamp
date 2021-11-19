package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPage extends CommonAPI {

    @FindBy (xpath = "//input[@placeholder='Search Jobs']")
    WebElement search;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]/a[1]")
    WebElement clickonjob;

    @FindBy (xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb iv3no6db a5q79mjw g1cxx5fr lrazzd5p bwm1u5wc']")
    WebElement Apply;

    @FindBy (xpath = "//input[@id='jsc_c_6']")
    WebElement email;

    @FindBy (xpath = "//input[@id='jsc_c_8']")
    WebElement password;

//    100000 jobs
    @FindBy (xpath = "//span[contains(text(),'yearly')]")
    WebElement yearly;

    @FindBy (xpath = "//input[@placeholder='Min']")
    WebElement min;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement clickapply;

    @FindBy (xpath = "//input[@id='jsc_c_i']")
    WebElement email1;

    @FindBy (xpath = "//input[@id='jsc_c_k']")
    WebElement password1;

//    Apply for jobs through Jobs Category

    @FindBy (xpath = "//span[contains(text(),'Information Technology')]")
    WebElement IT;

    @FindBy (xpath = "//span[contains(text(),'IT Managers')]")
    WebElement ITManager;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]")
    WebElement BrowseJob;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
    WebElement ApplyIT;

    public WebElement getIT() {
        return IT;
    }

    public WebElement getITManager() {
        return ITManager;
    }

    public WebElement getBrowseJob() {
        return BrowseJob;
    }

    public WebElement getApplyIT() {
        return ApplyIT;
    }

    public WebElement getEmail1() {
        return email1;
    }

    public WebElement getPassword1() {
        return password1;
    }

    public WebElement getClickapply() {
        return clickapply;
    }

    public WebElement getYearly() {
        return yearly;
    }

    public WebElement getMin() {
        return min;
    }

    public WebElement getApplyjobs() {
        return applyjobs;
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement applyjobs;



    public WebElement getSearch() {
        return search;
    }

    public WebElement getClickonjob() {
        return clickonjob;
    }

    public WebElement getApply() {
        return Apply;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public void JobsFirst(){
        typeEnter(getSearch(), "Software Quality Assurance Engineer");
        waitFor(2);
        clickOn(getClickonjob());
        waitFor(2);
        clickOn(getApply());
        waitFor(2);
        typeInto(getEmail(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getPassword(), "password");
        waitFor(2);

    }

    public void HundredKJobs(){
        clickOn(getYearly());
        waitFor(2);
        typeEnter(getMin(), "100000");
        waitFor(2);
        clickOn(getClickapply());
        waitFor(2);
        typeInto(getEmail1(), "alichy123@gmail.com");
        waitFor(2);
        typeInto(getPassword1(), "password");
        waitFor(2);
    }

    public void ITJobsCategory(){
        clickOn(getIT());
        waitFor(2);
        clickOn(getITManager());
        waitFor(2);
        clickOn(getBrowseJob());
        waitFor(2);
        clickOn(getApplyIT());
        waitFor(2);
    }
}
