package efinancialcareers.acceptanceTests;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/Search/search.feature",glue = "efinancialcareers",tags = "@search"
)
public class SearchTestSuite {

}
