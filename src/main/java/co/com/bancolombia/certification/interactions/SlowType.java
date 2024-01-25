package co.com.bancolombia.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.stream.IntStream;

public class SlowType  implements Interaction {


    private final String value;
    private final Target target;

    public SlowType(String value, Target target) {
        this.value = value;
        this.target = target;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement targetElement = target.resolveFor(actor);

        // No limpiar el campo antes de escribir
        IntStream.range(0, value.length()).forEach(i -> {
            targetElement.sendKeys(String.valueOf(value.charAt(i)));
            try {
                Thread.sleep(300); // Ajusta el tiempo de espera según sea necesario
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Agregar un ENTER al final para asegurar la activación de eventos asociados al campo
        targetElement.sendKeys(Keys.ENTER);
    }



        public static SlowType slowType(String value, Target target) {
            return new SlowType(value, target);
        }
    }

