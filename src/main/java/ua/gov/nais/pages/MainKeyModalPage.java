package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainKeyModalPage {

    private String password = "12345678";
    private WebDriver driver;


    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-sign-pin-modal/div[2]/form/input")
    private WebElement passwordKeyField;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-sign-pin-modal/div[3]/button[1]")
    private WebElement submitButton;

    public MainKeyModalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterKeyPassword(){
        passwordKeyField.sendKeys(password);
        submitButton.click();
    }

}
