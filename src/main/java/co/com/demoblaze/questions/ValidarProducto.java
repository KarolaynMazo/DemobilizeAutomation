package co.com.demoblaze.questions;

import co.com.demoblaze.userinterfaces.ProductoPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

@AllArgsConstructor
public class ValidarProducto implements Question {
    private Map<String, String> data;
    
    @Override
    public Object answeredBy(Actor actor) {

        Text.of(ProductoPage.nombre(data.get("Producto"))).answeredBy(actor).toString();
        Text.of(ProductoPage.precio(data.get("Precio"))).answeredBy(actor).toString();
        Text.of(ProductoPage.descripcion(data.get("Descripcion"))).answeredBy(actor).toString();
        actor.recall("producto");
return data;
    }

    public static ValidarProducto con(Map<String, String> data) {
        return new ValidarProducto(data);
    }
}
