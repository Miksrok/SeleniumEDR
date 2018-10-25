package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectPage {

    private WebDriver driver;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[1]/ul/li/ul/li[1]/a")
    private WebElement viewDetailsLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[1]/ul/li/ul/li[2]/a")
    private WebElement viewDetailsToDateLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[2]/ul/li/ul/li[1]/a")
    private WebElement registerChangesLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[2]/ul/li/ul/li[2]/a")
    private WebElement makingJudgmentLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[2]/ul/li/ul/li[3]/sidebar-menu-block[1]/ul/li/ul/li/a")
    private WebElement registerTerminationLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[2]/ul/li/ul/li[3]/sidebar-menu-block[2]/ul/li/ul/li/a")
    private WebElement cancelingActionLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[3]/ul/li/ul/li[1]/a")
    private WebElement errorCorrectionLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[3]/ul/li/ul/li[2]/a")
    private WebElement addProhibitionLink;

    @FindBy (xpath = "/html/body/app-root/div/content-wrapper/div/div[1]/sidebar-menu-wrapper/div/sidebar-menu-block[3]/ul/li/ul/li[3]/a")
    private WebElement cancelProhibitionLink;

    public SubjectPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
