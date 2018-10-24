package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    private WebDriver driver;

    private WebElement phoneNumber;

    public ContactsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterPhoneNumber(){
        phoneNumber.sendKeys("");
    }

}
