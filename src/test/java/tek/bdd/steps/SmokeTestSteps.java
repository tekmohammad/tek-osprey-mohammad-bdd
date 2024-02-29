package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class SmokeTestSteps extends SeleniumUtilities {

    @Then("Validate top left corner is {string}")
    public void validateTopLeftCorner(String expectedTitle) {

        String actualTitle = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
