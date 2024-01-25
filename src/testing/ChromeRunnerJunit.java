package testing;

import base.BaseChrome;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChromeRunnerJunit extends BaseChrome {
    //Test execution frameworks:
    //1. JUnit5 - is used a lot, mainly developers use
    //2. TestNG - is used for testing by testers.
    //3.



    @Test // Annotation(it strats with @ sign and we have to place it right above the method)
    public void test1() throws InterruptedException {

        driver.get("https://www.netflix.com/");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//span[@class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3']//ancestor::a[@href='/login']")).click();
        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(2000);
        WebElement accountNameBox = driver.findElement(By.id("id_userLoginId"));
        accountNameBox.sendKeys("whoknows");
        driver.findElement(By.id("id_password")).sendKeys("thisismypassword");
        driver.findElement(By.className("login-remember-me-label-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("create a new account")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign up now")).click();
        Thread.sleep(2000);



    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.delta.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("login-modal-button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helloworld");
        driver.findElement(By.xpath("//input[@aria-label='Last Name*']")).sendKeys("zarina");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hellonyc");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
    @Test
    public void test3() throws InterruptedException {

        driver.get("https://www.hulu.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("SIGN UP FOR HULU ONLY")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Looking for our student discount?")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@data-automationid='masthead_input_cta']//parent::span[@class='css-1hdv16d']")).click();
        driver.findElement(By.cssSelector("span[class='css-1hdv16d']")).click();
        Thread.sleep(1000);


    }



}


