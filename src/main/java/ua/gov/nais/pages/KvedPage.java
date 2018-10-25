package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KvedPage {

    private WebDriver driver;

    @FindBy (xpath = "//*[@id='tab-content-1-panel']/person-activities/api-dynamic-form-builder/div/form/div/div/div[3]/app-person-activities-table/div/div[1]/button[1]")
    public WebElement addKvedButton;


    @FindBy (xpath = "//*[@id='tab-content-1-panel']/person-activities/api-dynamic-form-builder/div/form/div/div/div[3]/app-person-activities-table/div/div[2]/app-table/div/div[2]/div[2]/table/tbody/tr/td[2]/div")
    private WebElement addKvedToListField;

    @FindBy (xpath = "//*[@id='tab-content-1-panel']/person-activities/api-dynamic-form-builder/div/form/div/div/div[3]/app-person-activities-table/div/div[1]/button[1]")
    private WebElement selectAsMainButton;




    public KvedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addKved(){
        addKvedButton.click();
        KvedModalPage kvedModalPage = new KvedModalPage(driver);
        kvedModalPage.selectKved();
        addKvedToListField.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectAsMainButton.click();
    }

}
