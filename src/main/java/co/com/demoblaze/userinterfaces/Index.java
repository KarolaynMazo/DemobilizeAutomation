package co.com.demoblaze.userinterfaces;

import co.com.demoblaze.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class Index {
    public static Target categorias(String categoria) {
        return Target.the("selecciona una categoria de la lista")
                .locatedBy(Utilitarios.reemplazar("//a[contains(text(),'%s')]", categoria));
    }


}


