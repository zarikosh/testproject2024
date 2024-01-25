package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFindingElements {

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
        //finding element
        WebElement usernameBox = driver.findElement(By.id("email"));
        //do the action
        usernameBox.sendKeys("myusername");
        driver.findElement(By.id("pass")).sendKeys("hello");
        driver.findElement(By.name("login")).click();
  //      driver.findElement(By.className(""));
 //       driver.findElement(By.name(""));
  //      driver.findElement(By.xpath(""));
  //      driver.findElement(By.cssSelector(""));
   //     driver.findElement(By.linkText(""));
   //     driver.findElement(By.partialLinkText(""));

    }
}
