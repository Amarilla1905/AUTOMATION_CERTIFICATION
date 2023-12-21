package co.com.bancolombia.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.xpath.objects.XNumber;
import org.openqa.selenium.WebDriver;

public class  SwitchToFrame implements Interaction {


        private final WebDriver driver;
        private final int number;

    public SwitchToFrame(WebDriver driver, int number) {
        this.driver = driver;
        this.number = number;
    }




        @Override
        public <T extends Actor> void performAs(T actor) {
            driver.switchTo().frame(number);
        }

        public static SwitchToFrame switchToIframe(WebDriver driver, int number) {
            return new SwitchToFrame(driver, number);
        }
    }






