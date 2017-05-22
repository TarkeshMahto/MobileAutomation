package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Tarkesh on 5/22/2017.
 */
public class BasicTest {
    private WebDriver driver;

    @BeforeSuite
    public void launchApplication(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarkesh\\IdeaProjects\\BrowserDriver\\chromedriver.exe");
        this.driver=new ChromeDriver();
        this.driver.get("https://www.google.com");
    }

    @AfterSuite
    public void closeApplication(){
        this.driver.quit();
    }
}
