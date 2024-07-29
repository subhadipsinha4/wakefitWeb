package TestCases;

import BaseClass.BaseClass;
import Pages.HomePages;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {

    @Test
    public void verifySearch() throws InterruptedException {
        HomePages homePages=new HomePages(driver);
        homePages.eneterSearchResult();
    }
}
