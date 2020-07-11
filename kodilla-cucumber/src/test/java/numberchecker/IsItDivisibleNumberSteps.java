package numberchecker;

import NumberChecker.NumberChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleNumberSteps implements En {
    private int number;
    private String answer;

    public IsItDivisibleNumberSteps() {
        Given("checking number is 3", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 3;
        });

        Given("checking number is 5", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 5;
        });

        Given("checking number is 8", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 8;
        });

        Given("checking number is 15", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 15;
        });

        Given("checking number is 21", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 21;
        });

        Given("checking number is 30", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 30;
        });

        Given("checking number is 40", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 40;
        });

        Given("checking number is 45", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 45;
        });

        Given("checking number is 50", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 50;
        });

        When("checking whether the following number is divisible by concrete factors", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("I should receive {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
