package co.com.demoblaze.questions;

import co.com.demoblaze.userinterfaces.ProductPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

@AllArgsConstructor
public class ValidateProduct implements Question {
    private Map<String, String> data;
    
    @Override
    public Object answeredBy(Actor actor) {

        Text.of(ProductPage.nombre(data.get("Product"))).answeredBy(actor).toString();
        Text.of(ProductPage.Price(data.get("Price"))).answeredBy(actor).toString();
        Text.of(ProductPage.Description(data.get("Description"))).answeredBy(actor).toString();
        actor.recall("Product");
return data;
    }

    public static ValidateProduct con(Map<String, String> data) {
        return new ValidateProduct(data);
    }
}
