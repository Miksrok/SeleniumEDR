package ua.gov.nais.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@placeholder = 'Користувач']")
    private WebElement loginField;

    @FindBy (xpath = "//input[@placeholder = 'Пароль']")
    private WebElement paasswordField;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/div[4]")
    private WebElement radioButton;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/div[6]/app-select-field/div/div/select")
    private WebElement selectField;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/div[6]/app-select-field/div/div/select/option[3]")
    private WebElement acsk;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/div[6]/input")
    private WebElement keyField;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/div[7]/input")
    private WebElement keyPassword;

    @FindBy (xpath = "/html/body/app-root/div/auth-form/div/div/form/button")
    private WebElement submitButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void openLoginPage(){
        driver.get("https://usrb-test.minjust.gov.ua/login");
    }
    public void typeLogin(){
        loginField.sendKeys("ivanov");
        paasswordField.sendKeys("ivanov");
        radioButton.click();
        selectField.click();
        acsk.click();
        selectField.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementsByTagName('input')[4].hidden = false;");
        jse.executeScript("document.getElementsByTagName('input')[4].readOnly = false;");

        WebElement keyPath = driver.findElement(By.xpath("/html/body/app-root/div/auth-form/div/div/form/div[6]/input"));
        keyPath.sendKeys("J:/EDR/ivanov_cnap_security_supervisor/Key-6.dat");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        keyPassword.sendKeys("12345678");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

       /* try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

    }

}
