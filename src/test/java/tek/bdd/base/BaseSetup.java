package tek.bdd.base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    private static ChromeDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public ChromeDriver getDriver() {
        return driver;
    }
}
