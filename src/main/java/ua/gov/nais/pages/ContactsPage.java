package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    private WebDriver driver;

    @FindBy (xpath = "//*[@id='tab-content-4-panel']/connection-info/div/api-dynamic-form-builder/div/form/div[1]/div/div[1]/app-input-field/div/div/input")
    private WebElement phoneNumber;

    public ContactsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterPhoneNumber(){
        phoneNumber.sendKeys("123456789012");
    }
}
