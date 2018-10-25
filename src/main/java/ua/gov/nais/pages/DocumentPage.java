package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.gov.nais.model.Fop;

public class DocumentPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Fop person;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/person-options/form/div[2]/button")
    private WebElement nextButton;

    //======================================About claimant block
    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[1]/button")
    private WebElement claimantButton;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[1]/div/div[2]/app-select-field/div/div/select")
    private WebElement claimantList;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[1]/div/div[2]/app-select-field/div/div/select/option[2]")
    private WebElement fo;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[2]/div/div[1]/app-input-field/div/div/input")
    private WebElement surnameField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[2]/div/div[2]/app-input-field/div/div/input")
    private WebElement nameField;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[1]/app-select-field/div/div/select")
    private WebElement personDocumentList;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[1]/app-select-field/div/div/select/option[2]")
    private WebElement personDocumentName;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[2]/app-input-field/div/div/input")
    private WebElement personDocumentNumber;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[4]/app-date-picker/div/div/input")
    private WebElement personDocumentDate;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-personal-document/api-dynamic-form-builder/div/form/div[3]/div/div[6]/app-input-field/div/div/input")
    private WebElement personDocumentOrganization;

    //======================================About fop block

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/app-collapse[2]/button")
    private WebElement aboutRibbon;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[1]/div/div[4]/app-date-picker/div/div/input")
    private WebElement dateOfBirthday;

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[1]/div/div[6]/app-input-field/div/div/input")
    private WebElement personCode;

    //=======================================

    @FindBy (xpath = "//*[@id='collapseExample']/div/div/person-main-info/api-dynamic-form-builder/div/form/div[2]/div/div/app-person-address/div/div/div/button")
    private WebElement openAdressModalPage;

    //=======================================Documents block
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

    //========================================Bottom block

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[1]/presubmit-options/form/div/app-checkbox[2]/div/label/input")
    private WebElement confirmationBox;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[1]/presubmit-options/form/div/app-checkbox[1]/div/label/input")
    private WebElement goToRegCard;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[2]/button")
    private WebElement confirm;

    public DocumentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public String clickDocuments(){
        nextButton.click();
        claimantButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        claimantList.click();
        fo.click();

        person = new Fop();
        surnameField.sendKeys(person.getSurname());
        nameField.sendKeys(person.getName());

        personDocumentList.click();
        personDocumentName.click();
        personDocumentNumber.sendKeys(person.getNumber());
        personDocumentDate.sendKeys("11.11.2011");
        personDocumentOrganization.sendKeys(person.getOrganization());

        //====================================

        aboutRibbon.click();
        dateOfBirthday.sendKeys(person.getBirthday());
        personCode.sendKeys(person.getCode());

        //====================================

        openAdressModalPage.click();
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return person.getCode();
        //====================================
    }
    public void addDoc(){
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

    public void lastStep(){
        confirmationBox.click();
        goToRegCard.click();
        confirm.click();
    }
    public boolean isUpload(){
         return wait.until(ExpectedConditions.textToBePresentInElement(notification, "Файл успішно завантажено"));
    }
}
