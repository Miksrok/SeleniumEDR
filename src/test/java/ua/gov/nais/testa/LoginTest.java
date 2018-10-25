package ua.gov.nais.testa;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.gov.nais.pages.*;

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
        RegistrationCard registrationCard = new RegistrationCard(driver);
        registrationCard.selectKved();
        KvedPage kvedPage = new KvedPage(driver);
        kvedPage.addKved();
        registrationCard.selectContacts();
        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.enterPhoneNumber();
        registrationCard.accept();
        keyModalPage.enterKeyPassword();

        /*for (int i = 0; i<=10; i++){

            mgp.clickCreateFopButton();
            DocumentPage dp1 = new DocumentPage(driver);
            dp1.clickDocuments();
            adress.addAdress();
            dp1.addDoc();
            Assert.assertTrue(dp1.isUpload());
            dp1.lastStep();
            keyModalPage.enterKeyPassword();
            registrationCard.selectKved();
            kvedPage.addKved();
            registrationCard.selectContacts();
            contactsPage.enterPhoneNumber();
            registrationCard.accept();
            keyModalPage.enterKeyPassword();
        }*/

    }

}
