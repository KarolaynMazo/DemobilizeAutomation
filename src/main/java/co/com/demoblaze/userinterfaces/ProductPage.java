package co.com.demoblaze.userinterfaces;

import co.com.demoblaze.utils.Utilitarios;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target nombre(String Product) {
        return Target.the("nombre del Product")
                .locatedBy(Utilitarios.reemplazar("//h2[contains(text(),'%s')]", Product));
    }
    public static Target Price(String Price) {
        return Target.the("Price")
                .locatedBy("//body/div[5]/div[1]/div[2]/h3[contains(text(),"+Price+"')]]");
    }
    public static Target Description(String Description) {
        return Target.the("Price")
                .locatedBy(Utilitarios.reemplazar("//p[contains(text(),'%s')]", Description));

    }
}
