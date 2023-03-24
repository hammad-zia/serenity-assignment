package efinancialcareers.stepdefinitions.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.awaitility.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;

import static com.openhtmltopdf.util.Util.sleep;
import static efinancialcareers.ui.LoginUI.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.efinancialcareers.co.uk/")
        );

    }
    @When("user enters {string} and {string}")
    public void login(String string, String string2) {

        theActorInTheSpotlight().attemptsTo(
                Click.on(ByShadow.cssSelector("#cmpwelcomebtnyes","#cmpwrapper"))
        );


        theActorInTheSpotlight().attemptsTo(
               WaitUntil.the(
                               SIGN_IN_BUTTON,isClickable()
               ).forNoMoreThan(30).seconds()
                       .then(
                Click.on(SIGN_IN_BUTTON)
               )
        );


        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(EMAIL_FIELD,isPresent()
                ).forNoMoreThan(30).seconds()
                        .then(
                        Enter.theValue(string).into(EMAIL_FIELD)
                )
        );

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CONTINUE_BUTTON,isVisible())
                        .forNoMoreThan(30).seconds()
                        .then(
                        Hit.the(Keys.ENTER).into(CONTINUE_BUTTON)
                )

        );

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CREATE_PROFILE,isVisible()).forNoMoreThan(30).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PASSWORD_FIELD,isVisible())
                        .forNoMoreThan(30).seconds()
                        .then(
                        Enter.keyValues(string2).into(PASSWORD_FIELD)
                )
        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(
                        JOIN_BUTTON,isVisible()
                ).forNoMoreThan(30).seconds()
                        .then(
                        Hit.the(Keys.ENTER).into(JOIN_BUTTON)
                )

        );

    }
    @Then("user should be able to see profile icon along with the email address")
    public void user_should_be_able_to_see_profile_icon_along_with_the_email_address() {
        theActorInTheSpotlight().attemptsTo(
                 WaitUntil.the(PROFILE_ICON,isClickable())
                         .forNoMoreThan(30).seconds()
                         .then(
                        Click.on(PROFILE_ICON).then(
                                WaitUntil.the(EMAIL_ID_IN_PROFILE_MENU, isVisible()).forNoMoreThan(30).seconds()
                        )
                )
        );
        sleep(10000);

    }
}

