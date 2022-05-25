package co.com.sophos.automatizacion.prueba.tasks;

import static co.com.sophos.automatizacion.prueba.userinterface.OffersPage.*;

import co.com.sophos.automatizacion.prueba.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TODOS_BUTTON),
                Wait.explicit(3000)
        );
    }

    public static ScrollPage down() {
        return instrumented(ScrollPage.class);
    }
}
