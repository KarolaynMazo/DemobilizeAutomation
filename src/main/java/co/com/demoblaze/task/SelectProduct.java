package co.com.demoblaze.task;

import co.com.demoblaze.interaction.Wait;
import co.com.demoblaze.models.Information;
import co.com.demoblaze.userinterfaces.Index;
import co.com.demoblaze.userinterfaces.LaptosPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.demoblaze.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class SelectProduct implements Task {

    private final Information informacion;

    public SelectProduct(Map<String, String> data) {
        informacion = Information.builder()
                .category(data.get(CATEGORY))
                .Product(data.get(PRODUCTS))
                .Price(data.get(PRICE))
                .Description(data.get(DESCRIPTION))
                .build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Index.categorys(informacion.getCategory()), isVisible()).forNoMoreThan(DIEZ).seconds(),
                Click.on(Index.categorys(informacion.getCategory())),
                Click.on(LaptosPage.Product(informacion.getProduct())));
                Wait.that(4);
                actor.remember("Product", LaptosPage.Product(informacion.getProduct()));
    }

    public static SelectProduct el(Map<String, String> data) {
        return Tasks.instrumented(SelectProduct.class, data);
    }
}
