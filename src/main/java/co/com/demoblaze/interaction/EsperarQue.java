package co.com.demoblaze.interaction;

import co.com.demoblaze.userinterfaces.Index;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.utils.Constantes.SESENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class EsperarQue implements Task {
    private Target elemento;


    public EsperarQue(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isCurrentlyVisible()).forNoMoreThan(SESENTA).seconds());

    }

    public static EsperarQue que(Target elemento) {
        return Tasks.instrumented(EsperarQue.class, elemento);
    }
}
