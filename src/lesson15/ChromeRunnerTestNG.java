package lesson15;

import base.BaseChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChromeRunnerTestNG extends BaseChrome {



    @Test // Annotation(it strats with @ sign and we have to place it right above the method)
    public void test1(){

        driver.get("https://www.letskodeit.com/parctice");



    }




}


