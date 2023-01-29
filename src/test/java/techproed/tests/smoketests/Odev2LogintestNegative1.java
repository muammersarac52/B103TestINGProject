package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class cc {





    @Test
    public void US100402_Negative_Login2() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));

        Thread.sleep(2000);
        Assert.assertFalse(blueRentalLoginPage.hata.isDisplayed());

    }
