package efinancialcareers.stepdefinitions.Apply;

import com.openhtmltopdf.util.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Paths;

import static efinancialcareers.ui.ApplyUI.*;
import static efinancialcareers.ui.SearchUI.APPLY_FIRST_JOB;
import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ApplyJobSteps {
    @Given("user has open job")
    public void user_is_on_job() {
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
    }
    @When("user enters {string} and {string} in job form")
    public void enter_information(String fname, String lname){
        theActorInTheSpotlight().attemptsTo(
            WaitUntil.the(FIRST_NAME,isVisible()).forNoMoreThan(30).seconds()
                    .then(
                            Enter.keyValues(fname).into(FIRST_NAME)
                    ),
                WaitUntil.the(SUR_NAME,isVisible()).forNoMoreThan(30).seconds()
                        .then(
                                Enter.keyValues(lname).into(SUR_NAME)
                        )

        );
    }
    @Then("user upload cv and click on Apply button")
    public void cv_upload(){
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(
                        OPEN_CV_UPLOAD_DIALOG,isVisible()
                ).forNoMoreThan(30).seconds().then(
                        Click.on(OPEN_CV_UPLOAD_DIALOG).then(
                                WaitUntil.the(
                                        CV_UPLOAD,isVisible()
                                ).forNoMoreThan(30).seconds()
                                        .then(
                                                Upload.theFile(Paths.get("src/test/resources/uploads/CV.pdf")).to(CV_UPLOAD)
                                        )
                        )
                )
        );
    }
}
