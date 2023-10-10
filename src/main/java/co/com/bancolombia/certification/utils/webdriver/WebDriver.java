package co.com.bancolombia.certification.utils.webdriver;

import co.com.bancolombia.certification.utils.Url;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriver {
    private ChromeDriver driver;

    private ChromeOptions chromeOptions;

    private WebDriver() {

        chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,  UnexpectedAlertBehaviour.ACCEPT);
        chromeOptions.addArguments
                ("--lang=es,--disabel-popup-blocking,--disable.download-notification,\\\n" +
                        "  --start-maximized,--test-type,--disable-extension,--force-device-scale-factor=0.7");

        driver = new ChromeDriver(chromeOptions);


    }
    public ChromeDriver testPlan() {

        driver.get(Url.URL);

        return driver;

    }

    public static WebDriver inLZ() {

        return new WebDriver();

    }



}
