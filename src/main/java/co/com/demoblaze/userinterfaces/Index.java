package co.com.demoblaze.userinterfaces;

import co.com.demoblaze.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class Index {
    public static Target categorys(String category) {
        return Target.the("selecciona una Categoryde la lista")
                .locatedBy(Utilitarios.reemplazar("//a[contains(text(),'%s')]", category));
    }


}


