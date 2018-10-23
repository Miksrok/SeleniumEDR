package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdressModalPage {

    private  WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[2]/app-select-field/div/div/select")
    private WebElement city;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[2]/app-select-field/div/div/select/option[27]")
    private WebElement cityName;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[3]/app-select-field/div/div/select")
    private WebElement district;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[3]/app-select-field/div/div/select/option[2]")
    private WebElement districtName;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[6]/div/app-autocomplete-input/div/div/input")
    private WebElement street;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[2]/form/div[2]/div[6]/div[1]/app-autocomplete-input/div/div/div[2]/button")
    private WebElement streetName;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/koatuu-modal/div/div[3]/button[1]")
    private WebElement saveButton;

    public AdressModalPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void addAdress(){

        sleep();
        city.click();
        cityName.click();
        System.out.println(district.getAttribute("class"));
        wait.until(ExpectedConditions.attributeToBe(district, "class", "form-control"));
        System.out.println(district.getAttribute("class"));
        district.click();
        districtName.click();
        sleep();
        street.sendKeys("Бігова");
        streetName.click();
        saveButton.click();
    }
    private void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
