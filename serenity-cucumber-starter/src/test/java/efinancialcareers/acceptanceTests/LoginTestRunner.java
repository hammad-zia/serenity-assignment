package efinancialcareers.acceptanceTests;

import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/Login/login.feature",glue = "efinancialcareers",tags = "@login"
)
public class LoginTestRunner
{
}
