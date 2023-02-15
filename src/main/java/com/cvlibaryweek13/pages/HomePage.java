package com.cvlibaryweek13.pages;


import com.cvlibaryweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath ="//input[@id='keywords']" )
    WebElement JobTitle;

    @FindBy(xpath ="//input[@id='location']")
    WebElement Location;

    @FindBy(xpath ="//select[@id='distance']" )
    WebElement Distance;

    @FindBy(xpath = "//div[@class='hp-search-more']//button[@id='toggle-hp-search']")
    WebElement Moresearchoptions;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement SalaryMin;

    @FindBy(xpath = "//input[@id='salarymax']" )
    WebElement SalaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryType;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement Jobtype;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement Findjobbutton;

    public void enterJobTitle(String jobTitle){
        sendTextToElement(JobTitle, jobTitle);
    }

    public void enterLocation(String location){
        sendTextToElement(Location,location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(Distance,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(Moresearchoptions);
        log.info("Click on more search option"+Moresearchoptions.toString());
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(SalaryMin,minSalary);
        log.info("Enter minimum salary"+SalaryMin.toString());
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(SalaryMax,maxSalary);
        log.info("Enter maximum salary"+maxSalary.toString());
    }

    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(SalaryType,sType);
        log.info("Enter your salary type "+SalaryType.toString());
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(Jobtype,jobType);
        log.info("select your job type"+Jobtype);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(Findjobbutton);
    }

    public void Jobdata(String jobTitle,String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){

        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);


    }






}
