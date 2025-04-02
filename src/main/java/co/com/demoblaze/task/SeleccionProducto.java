package co.com.demoblaze.task;

import co.com.demoblaze.interaction.Esperar;
import co.com.demoblaze.models.Informacion;
import co.com.demoblaze.userinterfaces.Index;
import co.com.demoblaze.userinterfaces.LaptosPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.demoblaze.utils.Constantes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class SeleccionProducto implements Task {

    private final Informacion informacion;

    public SeleccionProducto(Map<String, String> data) {
        informacion = Informacion.builder()
                .categoria(data.get(CATEGORIA))
                .producto(data.get(PRODUCTOS))
                .precio(data.get(PRECIO))
                .descripcion(data.get(DESCRIPCION))
                .build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Index.categorias(informacion.getCategoria()), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Click.on(Index.categorias(informacion.getCategoria())),
                Click.on(LaptosPage.producto(informacion.getProducto())));
                Esperar.que(4);
                actor.remember("producto", LaptosPage.producto(informacion.getProducto()));
    }

    public static SeleccionProducto el(Map<String, String> data) {
        return Tasks.instrumented(SeleccionProducto.class, data);
    }
}
