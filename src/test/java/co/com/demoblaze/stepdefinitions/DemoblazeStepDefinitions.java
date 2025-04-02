package co.com.demoblaze.stepdefinitions;

import co.com.demoblaze.questions.ValidarLista;
import co.com.demoblaze.questions.ValidarProducto;
import co.com.demoblaze.task.SeleccionProducto;
import co.com.demoblaze.task.SeleccionaCategoria;
import co.com.demoblaze.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.demoblaze.utils.Constantes.PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoblazeStepDefinitions {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Dado("que {string} desea navegar a la pagina Demoblaze")
    public void queClienteDeseaNavegarALaPaginaDemoblaze(String cliente) {
        theActor(cliente).wasAbleTo(Open.url(Constantes.URL));
    }

    @Cuando("el hace la seleccion de la {string}")
    public void elHaceLaSeleccionDeLaLaptos(String categoria) {
        theActorInTheSpotlight().attemptsTo(SeleccionaCategoria.laCategoria(categoria));
    }

    @Entonces("deberia ver una lista de productos")
    public void deberiaVerUnaListaDeProductos() {
        theActorInTheSpotlight().should(seeThat(ValidarLista.con(PRODUCTO), Matchers.is(PRODUCTO)));
    }


    @Cuando("seleccionar la Categoria y selecciona un Producto")
    public void seleccionarLaCategoriaYSeleccionaUnProducto(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(SeleccionProducto.el(data.get(0)));

    }

    @Entonces("verifico nombre del")
    public void verificoNombreDel(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(String.valueOf(seeThat(ValidarProducto.con(data.get(0))).equals(data.get(0))));
    }


}
