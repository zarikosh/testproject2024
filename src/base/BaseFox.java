package base;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseFox {
    protected WebDriver driver = null; // Glabol variables get the null value by default

    @BeforeClass // It runs before each test
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }
    @AfterClass // It runs after each test method
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
