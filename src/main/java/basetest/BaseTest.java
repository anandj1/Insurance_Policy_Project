package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.TestDataUtil;
import utils.Utils;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        if(Utils.fetchPropertyValue("browser").equals("chrome")) {
            driver = new ChromeDriver();
        }else if(Utils.fetchPropertyValue("browser").equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(Utils.fetchPropertyValue("browser").equals("edge")){
            driver = new EdgeDriver();
        }

        driver.get(Utils.fetchPropertyValue("URL").toString());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
