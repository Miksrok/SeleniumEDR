package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceptionOfDocumentsClaimantRibbonPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[1]/button")
    private WebElement claimantRibbonButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[1]/div/div[2]/app-select-field/div/div/select")
    private WebElement listOfClaimants;

    /*
    Claimant
    Start of list elements
     */
    @FindBy (xpath = "//option[text() = 'Фізична особа']")
    private WebElement physicalPerson;
    /*
    End of list elements
     */

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[2]/div/div[1]/app-input-field/div/div/input")
    private WebElement claimantSurnameField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[2]/div/div[2]/app-input-field/div/div/input")
    private WebElement claimantNameField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[1]/app-select-field/div/div/select")
    private WebElement claimantDocumentList;

    /*
    Document
    Start of list elements
     */
    @FindBy (xpath = ("//option[text() = 'Паспорт громадянина України']"))
    private WebElement claimantPassport;
    /*
    End of list elements
     */

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[2]/app-input-field/div/div/input")
    private WebElement claimantDocumentNumberField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[4]/app-date-picker/div/div/input")
    private WebElement claimantDocumentDateField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[6]/app-input-field/div/div/input")
    private WebElement claimantDocumentOrganizationField;

    /*
    Constructor
     */
    public ReceptionOfDocumentsClaimantRibbonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //===============================================================

    public void openClaimantRibbon(){
        claimantRibbonButton.click();
    }
    public void selectPhysicalPersonAsClaimant(){
        listOfClaimants.click();
        physicalPerson.click();
    }
    public void enterClaimantSurname(String surname){
        claimantSurnameField.sendKeys(surname);
    }
    public void enterClaimantName(String name){
        claimantNameField.sendKeys(name);
    }
    public void selectClaimantDocument(){
        claimantDocumentList.click();
        claimantPassport.click();
    }
    public  void enterClaimantDocumentNumber(String number){
        claimantDocumentNumberField.sendKeys(number);
    }
    public void enterClaimantDocumentDate(String date){
        claimantDocumentDateField.sendKeys(date);
    }
    public void enterClaimentDocumentOrganization(String organization){
        claimantDocumentOrganizationField.sendKeys(organization);
    }


}
