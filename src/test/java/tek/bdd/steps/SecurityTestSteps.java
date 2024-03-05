package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtilities;

public class SecurityTestSteps extends SeleniumUtilities {

    @Given("User click on Sign In Button")
    public void userClickOnSignInButton() {
        clickElement(HomePage.SING_IN_BUTTON);
    }
    @When("User enter username and password and click on Login")
    public void userEnterCredentialsAndClickLogin() {
        sendTextToElement(LoginPage.EMAIL_INPUT, "mohammad_osprey@tekschool.us");
        sendTextToElement(LoginPage.PASSWORD_INPUT, "12345678Ab@");

        clickElement(LoginPage.LOGIN_BUTTON);
    }
    @Then("User will see Account button on home page.")
    public void accountButtonWillDisplayOnHomePage() {
       boolean isDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isDisplayed);
    }
}
