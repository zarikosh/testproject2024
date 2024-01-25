package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebDriver {
    void get(String url);

    WebElement findElement(By idUserLoginId);
}
