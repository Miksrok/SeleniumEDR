package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KvedModalPage {

    private WebDriver driver;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-person-activities-modal/div[2]/div[1]/search-input/div/input")
    private WebElement searchKvedField;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-person-activities-modal/div[2]/div[1]/search-input/div/div/button[2]")
    private WebElement searchKvedButton;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-person-activities-modal/div[2]/div[2]/div[1]/table/tbody/tr/td[2]")
    private WebElement selectKvedField;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-person-activities-modal/div[3]/button[1]")
    private WebElement submitKvedBbutton;

    public KvedModalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectKved(){
        searchKvedField.sendKeys("11.01");
        searchKvedButton.click();
        selectKvedField.click();
        submitKvedBbutton.click();
    }

}
