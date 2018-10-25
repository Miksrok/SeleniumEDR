package ua.gov.nais.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainGridPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[1]/ul/li/ul/li[1]/a")
    private WebElement createFop;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[2]/business-entities/header/search-input/div/input")
    private WebElement searchField;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[2]/business-entities/header/search-input/div/div/button[2]")
    private WebElement searchButton;

    /*@FindBy (xpath = "/tbody/tr")
    private List<WebElement> list;*/

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[2]/business-entities/app-table/div/div[2]/div[2]/table/tbody/tr/td[7]/business-entities-table-actions/div/button")
    private WebElement showSubject;


    public MainGridPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void clickCreateFopButton(){
        createFop.click();
    }

    public void searchFopByCode(String code){
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(code);
        searchButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List list = driver.findElements(By.xpath("/html/body/app-root/div/content-wrapper/div/div[2]/business-entities/app-table/div/div[2]/div[2]/table/tbody/tr"));
        System.out.println(list.size());
        if (list.size() == 1){
            showSubject.click();
        }else{
            System.out.println("same elements are present");
        }

    }
}
