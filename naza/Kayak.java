package naza;

import base.BaseChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Kayak extends BaseChrome {

    @Test
    public void test1() throws InterruptedException {


        driver.get("https://www.kayak.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@role='button'])[10]")).click();
        WebElement Departure1 = driver.findElement(By.xpath("//input[@class='k_my-input']"));
        Thread.sleep(1000);
        Departure1.sendKeys("New York");
        Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            Departure1.sendKeys(Keys.ARROW_DOWN);
        }
        Departure1.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@role='button'])[12]")).click();
        Thread.sleep(1000);
        WebElement Departure2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        Departure2.sendKeys("Istanbul");
        Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            Departure2.sendKeys(Keys.ARROW_DOWN);
        }
        Departure2.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//h2[@class='title dark']")).click();
        driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("(//span[@class='sR_k-value'])[1]")).click();
        driver.findElement(By.xpath("//label[@class='Q9qx-label' and @for='MONTH']")).click();
        driver.findElement(By.xpath("//button[@class='Iqt3 Iqt3-mod-bold Button-No-Standard-Style Iqt3-mod-variant-none Iqt3-mod-theme-none Iqt3-mod-shape-rounded-medium Iqt3-mod-shape-mod-default Iqt3-mod-spacing-default Iqt3-mod-size-medium']")).click();
        driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-mcfly mkUa-mod-colorblind'])[1]")).click();
    }
}