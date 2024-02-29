package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtilities;

public class HookSteps extends SeleniumUtilities {

    //Hook that Run Before Each Scenario
    @Before
    public void initiateTest() {
        openBrowser();
    }

    //Hook Will Execute After Each Scenario
    //no matter what happened to Scenarios
    @After
    public void closingTest() {
      getDriver().quit();
    }
}
