package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainGridPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[1]/ul/li/ul/li[1]/a")
    private WebElement createFop;

    public MainGridPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void clickCreateFopButton(){
        createFop.click();
    }
}
