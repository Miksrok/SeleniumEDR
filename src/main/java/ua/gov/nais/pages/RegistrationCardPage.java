package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationCardPage {

        private WebDriver driver;

        @FindBy (xpath = "//*[@id='tab-content-1']/div")
        private WebElement kved;

        @FindBy (xpath = "//*[@id='tab-content-4']/div")
        private WebElement contacts;

        @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/registration-card/div[2]/div[2]/div[2]/button")
        private WebElement checkButton;

        @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div/registration-card/div[2]/div[2]/div[3]/button")
        private WebElement acceptButton;

        public RegistrationCardPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectKved(){
            kved.click();
        }

        public void selectContacts(){
            contacts.click();
        }

        public void accept(){
            checkButton.click();
            acceptButton.click();
        }

}
