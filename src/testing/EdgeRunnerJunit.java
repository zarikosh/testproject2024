package testing;

import base.BaseEdge;
import org.testng.annotations.Test;

public class EdgeRunnerJunit extends BaseEdge {
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
