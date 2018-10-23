package ua.gov.nais.testa;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.gov.nais.pages.AdressModalPage;
import ua.gov.nais.pages.DocumentPage;
import ua.gov.nais.pages.MainGridPage;
import ua.gov.nais.pages.MainKeyModalPage;

public class LoginTest extends BaseTestClass{

    @Test
    public void loginTest(){
        loginPage.openLoginPage();
        loginPage.typeLogin();
        MainGridPage mgp = new MainGridPage(driver);
        mgp.clickCreateFopButton();
        DocumentPage dp = new DocumentPage(driver);
        dp.clickDocuments();
        AdressModalPage adress = new AdressModalPage(driver);
        adress.addAdress();
        dp.addDoc();
        Assert.assertTrue(dp.isUpload());
        dp.lastStep();
        MainKeyModalPage keyModalPage = new MainKeyModalPage(driver);
        keyModalPage.enterKeyPassword();
    }

}
