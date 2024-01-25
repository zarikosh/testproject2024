package class19;

import base.BaseChrome;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Booking extends BaseChrome {

    @Test
    public void bookingFlights() throws InterruptedException {
        driver.get("https://www.cheapflights.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='lNCO-inner'])[1]")).click();
        WebElement box1 = driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]"));
        Thread.sleep(1000);
        box1.sendKeys("Hawaii");
        Thread.sleep(1000);
        for (int i=0; i< 3; i++){
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='lNCO-inner'])[2]")).click();
        driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys("New Zealand");
        Thread.sleep(1000);
        for (int i=0; i<2; i++){
            driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//span[@class='cQtq-value'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-default mkUa-mod-colorblind'])[2]")).click();

//        driver.findElement(By.xpath("(//span[@class='cQtq-value'])[2]")).click();
//        Thread.sleep(1000);

        driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-default mkUa-mod-colorblind'])[15]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='S9tW S9tW-pres-default S9tW-mod-spacing-medium S9tW-mod-stretch']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[@for='id-f']")).click();
        Thread.sleep(1000);


            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[2]")).click();
//        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[4]")).click();
//        Thread.sleep(1000);
            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[6]")).click();
//        Thread.sleep(1000);
            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[8]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[10]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[12]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[14]")).click();
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//h2[@class='RPax-title RPax-mod-variant-default']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class='Iqt3 Iqt3-mod-bold Button-No-Standard-Style Iqt3-mod-variant-solid Iqt3-mod-theme-progress Iqt3-mod-shape-rounded-medium Iqt3-mod-shape-mod-default Iqt3-mod-spacing-default Iqt3-mod-size-medium Iqt3-mod-animation-none']")).click();

        Thread.sleep(1000);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)){
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.xpath("(//div[@class='Iqt3-button-content'])[4]")).click();
            }
        }

        }


    }

