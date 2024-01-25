package lesson12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson12 {
    public static void main(String[] args) throws InterruptedException {

        //Driver loaction has to be specified
        //key=value, name = London
        //webdriver.chrome.driver={location}
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//automatically opens chrome
        //Move the window to the left
        //driver.manage().window().setPosition(new Point(x:2000; y=0));
        //Interacting with chrome browser:
        //1)open certain URL:
        driver.get("https://www.google.com/");
        //
//       pause for 2 sec
        Thread.sleep(1000);
        driver.navigate().to("https://google.com");

        Thread.sleep(000);
        driver.navigate().back();

        Thread.sleep(1000);
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().refresh();


        //driver.close();
 //       driver.quit();
    }
}
