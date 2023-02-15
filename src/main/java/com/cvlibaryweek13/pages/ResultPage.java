package com.cvlibaryweek13.pages;

import com.cvlibaryweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resulttext;

    public String verifyTheResults() {
        return getTextFromElement(resulttext);
    }

    public void resultMessage(String result) {
        String actualMsg = verifyTheResults(); //Get text from page
        String expectedMsg = result; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Results Verified!"); //Compare and Verify tes


    }
}

