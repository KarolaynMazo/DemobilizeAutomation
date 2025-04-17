package co.com.demoblaze.task;

import co.com.demoblaze.interaction.Wait;
import co.com.demoblaze.userinterfaces.Index;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.userinterfaces.LaptosPage.SCROLL;
import static co.com.demoblaze.utils.Constants.DIEZ;
import static co.com.demoblaze.utils.Constants.TRENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class SelectCategory implements Task {
    private String category;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Index.categorys(category), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Click.on(Index.categorys(category)),
                WaitUntil.the(Index.categorys(category), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Scroll.to(SCROLL),
                Wait.that(5)
        );

    }

    public static SelectCategory category(String category) {
        return Tasks.instrumented(SelectCategory.class, category);
    }
}
