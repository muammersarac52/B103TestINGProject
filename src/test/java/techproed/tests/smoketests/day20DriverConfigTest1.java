package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class day20DriverConfigTest1 {
    @Test
    public void firstTest() {
        //        amazon a git
//       driver -> Driver.getDriver()
//        ConfigReader.getProperty("amazon_url") -> https://www.amazon.com
        // Driver.getDriver().get(ConfigReader.getProperty("amazon_url")); // driver.get("https://www.amazon.com")
//        title in amazon icerdigini test et
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        //titlenin amazan icrdigini test et
        Driver.getDriver().getTitle().contains("amazon");
        Driver.closeDriver();
    }
}
