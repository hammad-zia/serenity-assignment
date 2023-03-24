package efinancialcareers.stepdefinitions.Search;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URISyntaxException;
import java.nio.file.Paths;


import static com.openhtmltopdf.util.Util.sleep;
import static efinancialcareers.ui.ApplyUI.*;
import static efinancialcareers.ui.ApplyUI.SUR_NAME;
import static efinancialcareers.ui.SearchUI.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchJobSteps extends PageObject{


    @Given("user is on main page")
    public void user_is_on_main_page() {
        theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.efinancialcareers.co.uk/")
        );
    // For Executing Plain JavaScript
//        String commandScript= (String) evaluateJavascript("alert('XSS')");
//        sleep(10000);
    }
    @When("user search a specific job by keyword")
    public void user_search_a_specific_job_by_keyword() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SEARCH_INPUT,isVisible()).forNoMoreThan(30 )
                        .seconds()
                        .then(
                                Enter.keyValues("QA Engineer").into(SEARCH_INPUT).thenHit(Keys.ENTER)
                )
        );
        sleep(10000);
        System.out.println("User search a specific job");
    }
    @Then("user should be able to see all jobs related to searched keyword")
    public void user_should_be_able_to_see_all_jobs_related_to_searched_keyword() throws URISyntaxException {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(VERIFY_SEARCH_FIRST_ITEM,isVisible()
                ).forNoMoreThan(30).seconds().then(
                        WaitUntil.the(VERIFY_SEARCH_FIRST_ITEM,isVisible()).forNoMoreThan(30).seconds()
                                        .then(
                                                Click.on(VERIFY_SEARCH_FIRST_ITEM).then(
                                                        WaitUntil.the(APPLY_FIRST_JOB,isVisible()).forNoMoreThan(30).seconds()
                                                )
                                        )

                )

        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(
                        APPLY_FIRST_JOB,isVisible()
                ).forNoMoreThan(30).seconds().then(
                        Click.on(APPLY_FIRST_JOB)
                                .then(
                                        WaitUntil.the(
                                                MODAL_JOB,isVisible()
                                        ).forNoMoreThan(30).seconds()
                                )
                )
        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(FIRST_NAME,isVisible()).forNoMoreThan(30).seconds()
                        .then(
                                Enter.keyValues("fname").into(FIRST_NAME)
                        ),
                WaitUntil.the(SUR_NAME,isVisible()).forNoMoreThan(30).seconds()
                        .then(
                                Enter.keyValues("lname").into(SUR_NAME)
                        )

        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(
                        OPEN_CV_UPLOAD_DIALOG,isVisible()
                ).forNoMoreThan(30).seconds().then(
                        Click.on(OPEN_CV_UPLOAD_DIALOG)
                )
                );


        sleep(5000);

        theActorInTheSpotlight().attemptsTo(
                Upload.theFile(Paths.get("src/test/java/efinancialcareers/uploads/CV.pdf")).to(CV_UPLOAD).then(
                        Click.on(

                        )
                )
);

        sleep(100000);


    }

}
