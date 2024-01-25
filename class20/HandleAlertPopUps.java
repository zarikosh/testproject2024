package class20;

import base.BaseChrome;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class HandleAlertPopUps extends BaseChrome {

    @Test
    public void testAlert () throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("benzradio")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hondaradio")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("benzcheck")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hondacheck")).click();
        Thread.sleep(1000);

        //needs my attention for further research
//        driver.findElement(By.id("openwindow")).click();
//        Thread.sleep(10000);
//        driver.findElement(By.id("opentab")).click();
//        Thread.sleep(1000);
        WebElement box1 = driver.findElement(By.id("carselect"));
        box1.click();
        Thread.sleep(1000);
        for(int i = 0; i<2; i++) {
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("//option[@value='orange']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("autosuggest")).sendKeys("How are you doing?");
        Thread.sleep(1000);
        driver.findElement(By.id("disabled-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("enabled-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("enabled-example-input")).sendKeys("automation class");
        Thread.sleep(1000);
        driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("show-textbox")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("displayed-text")).sendKeys("next test");
        Thread.sleep(1000);
        driver.findElement(By.id("alertbtn")).click();
        //alert popped up
        Alert alertPopUp = driver.switchTo().alert();
        String test = alertPopUp.getText();
        System.out.println(test);
        alertPopUp.accept();
        Thread.sleep(1000);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1000);
        String testClick = alertPopUp.getText();
        System.out.println(testClick);
        alertPopUp.dismiss();
        Thread.sleep(1000);
        WebElement target = driver.findElement(By.id("mousehover"));
        target.click();
        for (int i = 0; i<1; i++){
            target.sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(1000);




    }
    @Test
    public void testiFrame () throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(1000);
//        driver.findElement(By.id("benzradio")).click();
//        Thread.sleep(1000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@class='form-control find-input dynamic-text']")).click();
        driver.findElement(By.xpath("//input[@class='form-control find-input dynamic-text']")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='find-course search-course']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/blog']")).click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.id("hondacheck")).click();


    }

    }
