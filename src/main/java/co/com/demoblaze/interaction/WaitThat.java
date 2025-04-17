package co.com.demoblaze.interaction;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.utils.Constants.SESENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class WaitThat implements Task {
    private Target elemento;


    public WaitThat(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isCurrentlyVisible()).forNoMoreThan(SESENTA).seconds());

    }

    public static WaitThat that(Target elemento) {
        return Tasks.instrumented(WaitThat.class, elemento);
    }
}
