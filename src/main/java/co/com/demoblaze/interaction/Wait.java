package co.com.demoblaze.interaction;

import lombok.AllArgsConstructor;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class Wait implements Task {
    private int time;

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(time);

    }

    public static Wait that(int time) {
        return Tasks.instrumented(Wait.class, time);
    }
}
