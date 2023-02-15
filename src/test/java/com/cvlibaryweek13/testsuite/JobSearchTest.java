package com.cvlibaryweek13.testsuite;


import com.cvlibaryweek13.pages.HomePage;
import com.cvlibaryweek13.pages.ResultPage;
import com.cvlibaryweek13.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testdata.TestData;


public class JobSearchTest extends TestBase {
    HomePage homepage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homepage = new HomePage();
        resultPage = new ResultPage();
    }


    @Test(dataProvider = "JobSearch", dataProviderClass = TestData.class)
    public void doLogin(String jobTitle,String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) {
        homepage.enterJobTitle(jobTitle);
        homepage.enterLocation(location);
        homepage.selectDistance(distance);
        homepage.clickOnMoreSearchOptionLink();
        homepage.enterMinSalary(salaryMin);
        homepage.enterMaxSalary(salaryMax);
        homepage.selectSalaryType(salaryType);
        homepage.selectJobType(jobType);
        resultPage.resultMessage(result);


    }
}


