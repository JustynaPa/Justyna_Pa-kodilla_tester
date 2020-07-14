import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/homework/prevent_users_from_going_overdrawn.feature",
                    "src/test/resources/homework/display_balance.feature"}
)
public class TestRunnerHomework {
}