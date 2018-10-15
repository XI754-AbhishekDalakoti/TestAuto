package env;
import org.junit.runner.RunWith;
import org.junit.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
			 "pretty", "html:target/cucumberHtmlReport",
		     "html:target/cucumberHtmlReport",     //  for html result
			 "pretty:target/cucumber-json-report.json",
                "json:target/cucumber-report/cucumber.json",
                "json:target/cucumber-report/bar.json",

		     },
		features =  "classpath:features",
		glue = {"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
				"info.seleniumcucumber.userStepDefintions" // user step definitions package
			   }
)

public class RunCukeTest {

    }
