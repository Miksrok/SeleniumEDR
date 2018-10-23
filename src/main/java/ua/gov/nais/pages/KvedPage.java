package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KvedPage {

    private WebDriver driver;

    @FindBy (xpath = "//*[@id='tab-content-1-panel']/person-activities/api-dynamic-form-builder/div/form/div/div/div[3]/app-person-activities-table/div/div[1]/button[1]")
    public WebElement addKvedButton;

    public KvedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
