package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationCard {

        private WebDriver driver;

        @FindBy (xpath = "//*[@id='tab-content-1']/div")
        private WebElement kved;

        @FindBy (xpath = "//*[@id='tab-content-4']/div")
        private WebElement contacts;

        public RegistrationCard(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectKved(){
            kved.click();
        }

}
