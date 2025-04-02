package co.com.demoblaze.interaction;

import lombok.AllArgsConstructor;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


@AllArgsConstructor
public class Esperar implements Task {
    private int tiempo;


    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(tiempo);

    }

    public static Esperar que(int tiempo) {
        return Tasks.instrumented(Esperar.class, tiempo);
    }
}
