package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocumentPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/person-options/form/div[2]/button")
    private WebElement nextButton;

    //======================================
    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[1]/button")
    private WebElement claimantButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[1]/div/div[2]/app-select-field/div/div/select")
    private WebElement claimantList;

    @FindBy (xpath = "//*[@id=\"collapseExample\"]/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[1]/div/div[2]/app-select-field/div/div/select/option[2]")
    private WebElement fo;

    private WebElement surnameField;

    private WebElement nameField;

    private WebElement personDocumentList;

    private WebElement personDocumentName;

    private WebElement personDocumentDate;

    private WebElement personDocumentOrganization;

    

    //=======================================
    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[3]/button")
    private WebElement documentButton;

    @FindBy (xpath = "//*[@id=\"collapseExample\"]/div/div/person-document/form/div[1]/div[1]/app-select-field/div/div/select")
    private WebElement documentsList;

    @FindBy (xpath = "//*[@id=\"collapseExample\"]/div/div/person-document/form/div[1]/div[1]/app-select-field/div/div/select/option[2]")
    private WebElement registrationCard;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[2]/div[2]/app-date-picker/div/div/input")
    private WebElement documentDate;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[2]/div[1]/app-input-field/div/div/input")
    private WebElement documentNumber;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/form/div[1]/div[2]/button[1]")
    private WebElement addDocumentButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-document/app-table/div/div[2]/div[2]/table/tbody/tr/td[10]/document-actions/div/label/input")
    private WebElement uploadFile;

    @FindBy (xpath = "//span[text() = 'Файл успішно завантажено']")
    private WebElement notification;


    public DocumentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void clickDocuments(){
        nextButton.click();
        claimantButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        claimantList.click();
        fo.click();

        //====================================
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        documentButton.click();
        documentsList.click();
        registrationCard.click();
        documentNumber.sendKeys("123456");
        documentDate.sendKeys("11.11.2012");
        addDocumentButton.click();
        uploadFile.sendKeys("D://statut_TOV.pdf");

    }
    public boolean isUpload(){
         return wait.until(ExpectedConditions.textToBePresentInElement(notification, "Файл успішно завантажено"));
    }
}
