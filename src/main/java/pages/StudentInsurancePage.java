package pages;

import basetest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StudentInsurancePage {
    public WebDriver driver;

    public StudentInsurancePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); // <-- here
    }


}
