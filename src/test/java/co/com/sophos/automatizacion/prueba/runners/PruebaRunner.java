package co.com.sophos.automatizacion.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "co.com.sophos.automatizacion.prueba.stepdefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class PruebaRunner {
}
