package tek.bdd.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseSetup {

    private static WebDriver driver;

    public void openBrowser() {
        String browserType = "edge";
        if(browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Wrong browser Type");
        }

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }
}
