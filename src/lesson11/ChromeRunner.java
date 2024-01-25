package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.*;

public class ChromeRunner {
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
        driver.get("https://www.facebook.com/");
//        WebElement usernameBox = driver.findElement(By.id("email"));
//        usernameBox.sendKeys("hello_kitty");
//        driver.findElement(By.id("pass")).sendKeys("nycisbeautiful");
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.className(""));
//        driver.findElement(By.name(""));
//        driver.findElement(By.xpath(""));
//        driver.findElement(By.cssSelector(""));
//        driver.findElement(By.linkText(""));
//        driver.findElement(By.partialLinkText(""));
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        System.out.println(alllinks.size());
        for(WebElement link: alllinks){
            System.out.println(link.getAttribute("href"));
        }



//        System.out.println(driver.getPageSource());

  //      Thread.sleep(2000);
 //       driver.navigate().to("https://www.instagram.com");
   //     Thread.sleep(2000);
//        driver.navigate().back();

//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        Thread.sleep(2000);
//
//        driver.quit();

    }
}