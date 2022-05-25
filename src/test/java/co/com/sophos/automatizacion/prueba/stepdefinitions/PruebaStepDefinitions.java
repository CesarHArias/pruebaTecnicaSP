package co.com.sophos.automatizacion.prueba.stepdefinitions;

import co.com.sophos.automatizacion.prueba.tasks.ClickOnTheSection;
import co.com.sophos.automatizacion.prueba.tasks.ScrollPage;
import co.com.sophos.automatizacion.prueba.userinterface.HomePage;
import co.com.sophos.automatizacion.prueba.userinterface.OffersPage;
import co.com.sophos.automatizacion.prueba.utils.CaptureOffers;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class PruebaStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Cesar");
    private HomePage homePage = new HomePage();

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a user enters the Sophos Solutions website$")
    public void aUserEntersTheSophosSolutionsWebsite() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^the user enters the Trabaje con nosotros section$")
    public void theUserEntersTheTrabajeConNosotrosSection() {
        actor.attemptsTo(ClickOnTheSection.workWithUs(), ScrollPage.down());
    }

    @Then("^the user sees the available offers$")
    public void theUserSeesTheAvailableOffers() {
        actor.should(seeThat(the(OffersPage.VERIFY), isPresent()));
        String str = CaptureOffers.byDOM();
    }

}