package testrunner;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\main\\resources\\feature\\login1.feature",
glue={"stepdefinition"},
monochrome=true,
plugin={"pretty","html:target/html/reports/report.html",
		"json:target/jsonreports/reports.json",
		"junit:target/junitreports/report.xml"
})

public class testrunner1{
}
