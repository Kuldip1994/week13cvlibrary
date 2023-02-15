package testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name = "JobSearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow on the Hill, Greater London","up to 5 miles","30000","50000","Per annum","Permanent","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Automation Engineer","Wembley, Greater London","up to 10 miles","35000","40000","Per annum","Permanent","Permanent","Permanent Automation Engineer jobs in Wembley"},
                {"Commercial Engineer","St Annes, Lancashire","up to 15 miles","30500","60000","Per annum","Permanent","Permanent","Permanent Commercial Engineer jobs in Lytham"},
                {"Software engineer","Central London","up to 10 miles","45000","65000","Per annum","Permanent","Permanent","Permanent Software Engineer jobs in Central London"},
                {"Software Developer","Leicestershire","up to 25 miles","25000","40000","Per annum","Permanent","Permanent","Permanent Software Developer jobs in Leicestershire"},
                {"Sales Manager","Crawley, West Sussex","up to 15 miles","50000","65000","Per annum","Permanent","Permanent","Permanent Sales Manager jobs in Crawley"},
                {"Biology Teacher","Birmingham","up to 10 miles","25000","40000","Per annum","Permanent","Permanent","Permanent Biology Teacher jobs in Birmingham"},
        };
        return data;
    }



}
