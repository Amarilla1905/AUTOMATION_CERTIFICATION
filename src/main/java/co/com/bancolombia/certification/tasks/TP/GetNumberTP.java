package co.com.bancolombia.certification.tasks.TP;

import co.com.bancolombia.certification.questions.GetNumberTPQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class GetNumberTP implements Task {

    private final GetNumberTPQuestion getNumberTPQuestion;

    public GetNumberTP(GetNumberTPQuestion getNumberTPQuestion) {
        this.getNumberTPQuestion = getNumberTPQuestion;
    }

    public static GetNumberTP getNumberTP(Target elemento) {
        return new GetNumberTP(GetNumberTPQuestion.getNumberTPQuestion(elemento));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        getNumberTPQuestion.answeredBy(actor);
    }
}