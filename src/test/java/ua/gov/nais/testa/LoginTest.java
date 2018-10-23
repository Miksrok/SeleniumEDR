package ua.gov.nais.testa;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.gov.nais.pages.DocumentPage;
import ua.gov.nais.pages.MainGridPage;

public class LoginTest extends BaseTestClass{

    @Test
    public void loginTest(){
        loginPage.openLoginPage();
        loginPage.typeLogin();
        MainGridPage mgp = new MainGridPage(driver);
        mgp.clickCreateFopButton();
        DocumentPage dp = new DocumentPage(driver);
        dp.clickDocuments();
        Assert.assertTrue(dp.isUpload());
    }

}
