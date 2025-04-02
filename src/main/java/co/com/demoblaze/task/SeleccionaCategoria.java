package co.com.demoblaze.task;

import co.com.demoblaze.interaction.Esperar;
import co.com.demoblaze.userinterfaces.Index;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.userinterfaces.LaptosPage.SCROLL;
import static co.com.demoblaze.utils.Constantes.DIEZ;
import static co.com.demoblaze.utils.Constantes.TRENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class SeleccionaCategoria implements Task {
    private String categoria;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Index.categorias(categoria), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Click.on(Index.categorias(categoria)),
                WaitUntil.the(Index.categorias(categoria), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Scroll.to(SCROLL),
                Esperar.que(5)
        );

    }

    public static SeleccionaCategoria laCategoria(String Categoria) {
        return Tasks.instrumented(SeleccionaCategoria.class, Categoria);
    }
}
