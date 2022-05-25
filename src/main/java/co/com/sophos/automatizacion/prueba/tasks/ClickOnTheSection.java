package co.com.sophos.automatizacion.prueba.tasks;

import static co.com.sophos.automatizacion.prueba.userinterface.LandingPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickOnTheSection implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(POP_UP, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(POP_UP),
                WaitUntil.the(TRABAJO_BUTTON,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(TRABAJO_BUTTON));
    }

    public static ClickOnTheSection workWithUs() {
        return instrumented(ClickOnTheSection.class);
    }

}
