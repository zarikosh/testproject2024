package class19;

import base.BaseChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

    public class CalendarDropDownTest extends BaseChrome {
        @Test
        public void testCheapOAir() throws InterruptedException {
            driver.get("https://www.cheapoair.com/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//a[@aria-label='clear field'])[1]")).click();
            WebElement box1 = driver.findElement(By.xpath("//input[@id='from0']"));
            box1.sendKeys("New York");
            Thread.sleep(1000);
            for(int i = 0; i<5; i++) {
                box1.sendKeys(Keys.ARROW_DOWN);
            }
            box1.sendKeys(Keys.ENTER);
            WebElement box2 = driver.findElement(By.xpath("//input[@id='to0']"));
            box1.sendKeys("New York");
            Thread.sleep(1000);
            for(int i = 0; i<5; i++) {
                box2.sendKeys(Keys.ARROW_DOWN);
            }
            box2.sendKeys(Keys.ENTER);
        }
    }

