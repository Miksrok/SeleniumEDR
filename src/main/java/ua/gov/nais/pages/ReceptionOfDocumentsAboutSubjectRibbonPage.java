package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceptionOfDocumentsAboutSubjectRibbonPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[2]/button")
    private WebElement aboutPhisicalPersonRibbonButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[1]/div/div[4]/app-date-picker/div/div/input")
    private WebElement dateOfBirthdayField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[1]/div/div[6]/app-input-field/div/div/input")
    private WebElement phisicalPersonCodeField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[2]/div/div/app-person-address/div/div/div/button")
    private WebElement openAdressModalPageButton;

    /*
    Constructor
     */
    public ReceptionOfDocumentsAboutSubjectRibbonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //====================================================================

    public void openAboutPhisicalPersonRibbon(){
        aboutPhisicalPersonRibbonButton.click();
    }
    public void enterDateOfBirtday(String bDate){
        dateOfBirthdayField.sendKeys(bDate);
    }
    public void enterPhisicalPersonCode(String code){
        phisicalPersonCodeField.sendKeys(code);
    }
    public void openAdressModalPage(){
        openAdressModalPageButton.click();
    }

}
