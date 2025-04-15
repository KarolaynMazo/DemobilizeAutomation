package co.com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.demoblaze.stepdefinitions",
        features = "src/test/resources/features/demoblaze.feature",
        snippets = SnippetType.CAMELCASE
     
)

public class Demoblaze {

}
