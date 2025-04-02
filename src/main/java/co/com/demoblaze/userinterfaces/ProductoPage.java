package co.com.demoblaze.userinterfaces;

import co.com.demoblaze.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {
    public static Target nombre(String producto) {
        return Target.the("nombre del producto")
                .locatedBy(Utilitarios.reemplazar("//h2[contains(text(),'%s')]", producto));
    }
    public static Target precio(String precio) {
        return Target.the("precio")
                .locatedBy("//body/div[5]/div[1]/div[2]/h3[contains(text(),"+precio+"')]]");
    }
    public static Target descripcion(String descripcion) {
        return Target.the("precio")
                .locatedBy(Utilitarios.reemplazar("//p[contains(text(),'%s')]", descripcion));

    }
}
