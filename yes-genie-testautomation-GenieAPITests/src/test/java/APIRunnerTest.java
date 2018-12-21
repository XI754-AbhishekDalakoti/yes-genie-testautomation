import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/apiFeatures/"
       // , tags = "~@updatedrole,~@nba,~@relationship"
        , tags = "@search,@demographics,@e2e"
)

public class APIRunnerTest {

}
