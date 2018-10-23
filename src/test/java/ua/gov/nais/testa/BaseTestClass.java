package ua.gov.nais.testa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.gov.nais.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTestClass {

    private final String CHROME_PATH = "src\\test\\resources\\chromedriver.exe";

    protected WebDriver driver;
    protected LoginPage loginPage;

    private WebDriver getDriver(String browser) {
        switch (browser){
            default:{
                System.setProperty("webdriver.chrome.driver", CHROME_PATH);
                return new ChromeDriver();
            }
        }
    }

    @BeforeClass
    public void setUp() {
        driver = getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() {
       if (driver != null) {
            driver.quit();
       }
    }



}
