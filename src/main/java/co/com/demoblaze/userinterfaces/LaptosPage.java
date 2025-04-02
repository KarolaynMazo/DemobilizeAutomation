package co.com.demoblaze.userinterfaces;

import co.com.demoblaze.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class LaptosPage {
    public static Target SCROLL = Target.the("Elemento para hacer scroll")
            .locatedBy("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/h5[1]");

    public static Target producto(String producto) {
        return Target.the("Selecciona un producto de la lista")
                .locatedBy(Utilitarios.reemplazar("//a[contains(text(),'%s')]", producto));
    }
}
