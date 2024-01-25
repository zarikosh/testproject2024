package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailRuChrome {
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
        driver.get("https://www.mail.ru/");
        //finding element
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big mpnhkph__de8k2m']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='input-0-2-71']")).sendKeys("helloworld");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-test-id='next-button']/input[@class='inner-0-2-81 innerTextWrapper-0-2-82']")).click();
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hellonyc");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.id("search_input")).sendKeys("JFK");
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("Forgot password")).click();




    }


}
