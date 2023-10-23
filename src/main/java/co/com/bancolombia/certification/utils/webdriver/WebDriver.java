package co.com.bancolombia.certification.utils.webdriver;

import co.com.bancolombia.certification.utils.Url;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;



import java.util.concurrent.TimeUnit;



public class WebDriver {



    private ChromeDriver driver;

    private ChromeOptions chromeOptions;



    private WebDriver() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/files/chromedriver.exe");

        chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--binary --start-maximized --ignore-certificate-errors --disable-download-notification");

        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);

    }

    public ChromeDriver testPlan() {
        driver.get(Url.URL);
        return driver;
    }

    public static WebDriver inLZ() {
        return new WebDriver();
    }

    public static void main(String[] args) {
        WebDriver webDriver = new WebDriver();
        ChromeDriver driver = webDriver.testPlan();

        // Verifica la URL abierta
        System.out.println("URL opened: " + driver.getCurrentUrl());
    }
}
