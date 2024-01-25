package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox1Runner {
        public static void main(String[] args) throws InterruptedException {

            //Driver loaction has to be specified
            //key=value, name = London
            //webdriver.chrome.driver={location}
            System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();//automatically opens chrome
            //Move the window to the left
            //driver.manage().window().setPosition(new Point(x:2000; y=0));
            //Interacting with chrome browser:
            //1)open certain URL:
            driver.get("https://www.amazon.com/");
//
//            Thread.sleep(2000);
//            driver.navigate().to("https://www.instagram.com");
//            Thread.sleep(2000);
//            driver.navigate().back();
//
//            Thread.sleep(2000);
//            driver.navigate().forward();
//            Thread.sleep(2000);
//            driver.navigate().refresh();
//            Thread.sleep(2000);
//            driver.navigate().refresh();
//            Thread.sleep(2000);
//            Thread.sleep(2000);
//
//            driver.quit();

        }
    }
