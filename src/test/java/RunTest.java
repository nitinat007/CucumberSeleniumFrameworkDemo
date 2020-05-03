import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Author: nitinkumar
 * Created Date: 02/05/20
 * Info: Start Test from here
 **/

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}
        //to run only listed feature
        //,features = "src/test/resources/com.test/features/wikiSearch.feature"
)
public class RunTest {
}
