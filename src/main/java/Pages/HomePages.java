package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.indexeddb.model.Key;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePages {

    public WebDriver driver;
    public HomePages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[contains(text(),'Search')]")
    public WebElement searchText;


    @FindBy(xpath = "//p[@class='line-clamp-1 max-h-10 w-fit truncate text-sm font-normal lg:block xs:hidden ']")
   // @FindBy(xpath = "//div[@class='flex max-h-10 w-full items-center gap-1 rounded-sm px-1 pb-2 font-normal lg:bg-[#F3EDFE] lg:p-2 lg:px-4 lg:text-black']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='grid place-items-end md:mx-5 lg:place-items-start']//*[@id='a']")
    private WebElement searchIcon;


    public HomePages eneterSearchResult() throws InterruptedException {
        Thread.sleep(6000);
        Assert.assertTrue(searchText.isDisplayed());
        searchText.sendKeys();

        return this;
    }
}
