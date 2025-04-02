package co.com.demoblaze.questions;

import co.com.demoblaze.userinterfaces.LaptosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.utils.Constantes.TRENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarLista implements Question<String> {
    private String producto;

    public ValidarLista(String producto) {
        this.producto = producto;
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LaptosPage.producto(producto), isVisible()).forNoMoreThan(TRENTA).seconds();

        return Text.of(LaptosPage.producto(producto)).answeredBy(actor).toString();
    }

    public static ValidarLista con(String producto) {
        return new ValidarLista(producto);
    }
}
