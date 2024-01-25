package testing;

import base.BaseFox;
import org.testng.annotations.Test;

public class FireFoxRunnerJunit extends BaseFox {
    @Test // Annotation(it strats with @ sign and we have to place it right above the method)
    public void test1() throws InterruptedException {

        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);


    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(2000);


    }



}
