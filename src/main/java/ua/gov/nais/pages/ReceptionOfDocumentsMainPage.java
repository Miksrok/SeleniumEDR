package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceptionOfDocumentsMainPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/person-options/form/div[2]/button")
    private WebElement nextButton;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[1]/presubmit-options/form/div/app-checkbox[2]/div/label/input")
    private WebElement confirmationBox;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[1]/presubmit-options/form/div/app-checkbox[1]/div/label/input")
    private WebElement goToRegCardBox;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/create-phys-person/div/div[2]/div/div[2]/button")
    private WebElement confirmButton;

    /*
    Constructor
     */
    public ReceptionOfDocumentsMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //========================================================

    public void clickNextButton(){
        nextButton.click();
    }
    public  void checkConfirmationBox(){
        confirmationBox.click();
    }
    public void checkGoToRegCardBox(){
        goToRegCardBox.click();
    }
    public void clickConfirmButton(){
        confirmationBox.click();
    }

}
