package co.com.demoblaze.questions;

import co.com.demoblaze.userinterfaces.LaptosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.utils.Constants.TRENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValiteList implements Question<String> {
    private String Product;

    public ValiteList(String Product) {
        this.Product = Product;
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LaptosPage.Product(Product), isVisible()).forNoMoreThan(TRENTA).seconds();

        return Text.of(LaptosPage.Product(Product)).answeredBy(actor).toString();
    }

    public static ValiteList con(String Product) {
        return new ValiteList(Product);
    }
}
