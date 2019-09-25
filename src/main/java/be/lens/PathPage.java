package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PathPage {
    static String url = "https://www.pluralsight.com/paths";
    static String title = "Java | Pluralsight";

    public void goTo() {
        Browser.goTo(url);
    }

    public void goToJavaPath() {
        String elem = "//*[@id=\"pathContent\"]/div[128]/a/div/div[2]";

        WebElement myelement = Browser.driver.findElement(By.xpath(elem));
        JavascriptExecutor jse2 = (JavascriptExecutor) Browser.driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        jse2.executeScript("window.scrollBy(0,-250)");

        Browser.driver.findElement(By.xpath(elem)).click();
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
