package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Odev2Logintest {
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100402_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("odev2_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("odev2_password"));
        blueRentalLoginPage.loginButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(blueRentalLoginPage.error_message_odev2.getText(), "email must be a valid email");


    }
}

