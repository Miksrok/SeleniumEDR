package ua.gov.nais.testa;

import org.testng.annotations.Test;
import ua.gov.nais.model.Fop;
import ua.gov.nais.pages.*;

public class LoginTest extends BaseTestClass{

   /* @Test
    public void loginTest2(){
        loginPage.openLoginPage();
        loginPage.typeLogin();
        MainGridPage mgp = new MainGridPage(driver);
        mgp.clickCreateFopButton();
        DocumentPage dp = new DocumentPage(driver);
        //========
        String code = dp.clickDocuments();
        //========
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
        //=========================
        mgp.searchFopByCode(code);

    }*/

    @Test
    public void createPhisicalPersonTest(){
        Fop fop = new Fop();
        loginPage.openLoginPage();
        loginPage.typeLogin();
        MainGridPage mgp = new MainGridPage(driver);
        mgp.clickCreateFopButton();
        ReceptionOfDocumentsMainPage receptionOfDocumentsMainPage =
                new ReceptionOfDocumentsMainPage(driver);
        receptionOfDocumentsMainPage.clickNextButton();
        ReceptionOfDocumentsClaimantRibbonPage receptionOfDocumentsClaimantRibbonPage =
                new ReceptionOfDocumentsClaimantRibbonPage(driver);
        receptionOfDocumentsClaimantRibbonPage.openClaimantRibbon();
        receptionOfDocumentsClaimantRibbonPage.selectPhysicalPersonAsClaimant();
        receptionOfDocumentsClaimantRibbonPage.enterClaimantSurname(fop.getSurname());
        receptionOfDocumentsClaimantRibbonPage.enterClaimantName(fop.getName());
        receptionOfDocumentsClaimantRibbonPage.selectClaimantDocument();
        receptionOfDocumentsClaimantRibbonPage.enterClaimantDocumentNumber(fop.getNumber());
        receptionOfDocumentsClaimantRibbonPage.enterClaimantDocumentDate(fop.getDate());
        receptionOfDocumentsClaimantRibbonPage.enterClaimentDocumentOrganization(fop.getOrganization());
        ReceptionOfDocumentsAboutSubjectRibbonPage receptionOfDocumentsAboutSubjectRibbonPage =
                new ReceptionOfDocumentsAboutSubjectRibbonPage(driver);
        receptionOfDocumentsAboutSubjectRibbonPage.openAboutPhisicalPersonRibbon();
        receptionOfDocumentsAboutSubjectRibbonPage.enterDateOfBirtday(fop.getBirthday());
        receptionOfDocumentsAboutSubjectRibbonPage.enterPhisicalPersonCode(fop.getCode());
        receptionOfDocumentsAboutSubjectRibbonPage.openAdressModalPage();
        AdressModalPage adress = new AdressModalPage(driver);
        adress.addAdress();
        //продолжить с документами


    }

}
