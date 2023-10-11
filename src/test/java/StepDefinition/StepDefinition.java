package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("lands on homepage which greets the user with ohayo gosaimas")
    public void landsOnHomepageWhichGreetsTheUserWithOhayoGosaimas() {
        System.out.println("lands on homepage which greets the user with ohayo gosaimas");
    }

    @When("user enters {string} and {int}")
    public void userEntersAnd(String arg0, int arg1) throws PendingException {
        System.out.println("hi"+arg0);
        System.out.println(arg1);
    }

    @Then("homepage is populated")
    public void homepageIsPopulated() {
        System.out.println("homepage is populated");
    }

    @And("the greeting message is displayed")
    public void theGreetingMessageIsDisplayed() {
        System.out.println("the greeting message is displayed");
    }

}
