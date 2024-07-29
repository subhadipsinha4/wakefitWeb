package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\IdeaProjects\\Web1\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wakefit.co/");
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
