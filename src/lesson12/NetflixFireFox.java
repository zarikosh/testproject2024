package lesson12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NetflixFireFox {

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
            driver.get("https://www.netflix.com/");
            driver.manage().window().maximize();
            //finding element
            driver.findElement(By.linkText("Sign In")).click();
            Thread.sleep(2000);
            WebElement accountNameBox = driver.findElement(By.id("id_userLoginId"));
            ((WebElement) accountNameBox).sendKeys("whoknows");
            driver.findElement(By.id("id_password")).sendKeys("thisismypassword");
            driver.findElement(By.className("login-remember-me-label-text")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("login-button")).click();
            Thread.sleep(2000);
            driver.quit();




        }
}
