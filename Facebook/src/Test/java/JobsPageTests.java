mport Pages.HomePage;
import Pages.JobsPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JobsPageTests extends CommonAPI {

    //    looking for Software Quality Assurance Manager Jobs

    @Test
    public void QAJobsSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        JobsPage jobsPage = PageFactory.initElements(driver, JobsPage.class);
        homePage.Jobs();
        jobsPage.JobsFirst();
    }


    //    looking for 100KJobs
    @Test
    public void HundredKJobsSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        JobsPage jobsPage = PageFactory.initElements(driver, JobsPage.class);
        homePage.Jobs();
        jobsPage.HundredKJobs();
    }

    @Test
    public void ITJobsCategoryBrowse(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        JobsPage jobsPage = PageFactory.initElements(driver, JobsPage.class);
        homePage.Jobs();
        jobsPage.ITJobsCategory();
    }



}