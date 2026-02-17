package basetest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.TestDataUtil;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        if(TestDataUtil.fetchPropertyValue("browser").equals("chrome")) {
            driver = new ChromeDriver();
        }else if(TestDataUtil.fetchPropertyValue("browser").equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(TestDataUtil.fetchPropertyValue("browser").equals("edge")){
            driver = new EdgeDriver();
        }

        driver.get(TestDataUtil.fetchPropertyValue("URL").toString());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
