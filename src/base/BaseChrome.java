package base;

//import org.junit.After;
//import org.junit.Before;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseChrome {
    protected WebDriver driver = null; // Glabol variables get the null value by default

    @BeforeMethod // It runs before each test
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

    }
//    @AfterMethod // It runs after each test method
//    public void teardown() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.quit();
//    }
}
