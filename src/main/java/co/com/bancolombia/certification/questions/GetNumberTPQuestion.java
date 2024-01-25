package co.com.bancolombia.certification.questions;

import co.com.bancolombia.certification.userinterfaces.TP.TestPlanPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GetNumberTPQuestion implements Question<String> {

    public final Target elemento;

    public GetNumberTPQuestion(Target elemento) {
        this.elemento = elemento;
    }

    public static GetNumberTPQuestion getNumberTPQuestion(Target elemento) {
        return new GetNumberTPQuestion(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(elemento),
                JavaScriptClick.on(elemento)
        );

        String textoDelElemento = elemento.resolveFor(actor).getText();
        String numeroConcatenado = "Evidencia VSTS:" + textoDelElemento;
        System.out.println(numeroConcatenado);
        System.out.println(textoDelElemento);
        return numeroConcatenado;
    }
}