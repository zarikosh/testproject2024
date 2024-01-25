package base;
//

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseEdge {

        protected WebDriver driver = null; // Glabol variables get the null value by default

        @BeforeClass // It runs before each test
        public void setup() throws InterruptedException {
            System.setProperty("webdriver.msedge.driver", "C:\\webdriver\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().setPosition(new Point(2000, 0));
            driver.manage().window().maximize();
            Thread.sleep(1000);

        }
        @AfterClass// It runs after each test method
        public void teardown() throws InterruptedException {
            Thread.sleep(1000);
            driver.quit();
        }
    }
