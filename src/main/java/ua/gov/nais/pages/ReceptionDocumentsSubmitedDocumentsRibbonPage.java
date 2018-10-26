package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReceptionDocumentsSubmitedDocumentsRibbonPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[3]/button")
    private WebElement documentRibbonButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[1]/div[1]/app-select-field/div/div/select")
    private WebElement listOfDocuments;

    /*
    Document
    start of list elements
     */
    @FindBy (xpath = "//option[text() = 'Реєстраційна картка на проведення державної реєстрації фізичної особи-підприємця']")
    private WebElement registrationCard;
    /*
    end of list elements
     */

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[2]/div[2]/app-date-picker/div/div/input")
    private WebElement documentDateField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[2]/div[1]/app-input-field/div/div/input")
    private WebElement documentNumberField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[1]/div[2]/button[1]")
    private WebElement addDocumentButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/app-table/div/div[2]/div[2]/table/tbody/tr/td[10]/document-actions/div/label/input")
    private WebElement uploadFile;

    @FindBy (xpath = "//span[text() = 'Файл успішно завантажено']")
    private WebElement notification;

    /*
    Constructor
     */
    public ReceptionDocumentsSubmitedDocumentsRibbonPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    //==================================================

    public void openSubmitedDocumentsRibbon(){
        documentRibbonButton.click();
    }
    public void selectRegistrationCardFromList(){
        listOfDocuments.click();
        registrationCard.click();
    }
    public void enterDocumentNumber(){
        documentNumberField.sendKeys("123456");
    }
    public void enterDocumentDate(){
        documentDateField.sendKeys("11.11.2012");
    }
    public void addDocument(){
        addDocumentButton.click();
    }
    public void uploadFile(){
        uploadFile.sendKeys("D://statut_TOV.pdf");
    }
    public boolean isUpload(){
        return wait.until(ExpectedConditions.textToBePresentInElement(notification, "Файл успішно завантажено"));
    }

}
