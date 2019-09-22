package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PathPage {
    static String url = "https://www.pluralsight.com/paths";
    static String title = "Java | Pluralsight";

    public void goTo() {
        Browser.goTo(url);
    }

    public void goToJavaPath() {
        /*
        from IDE recording

        driver.findElement(By.cssSelector(".header_nav_primary")).click();
        driver.findElement(By.linkText("View all paths >")).click();
        driver.findElement(By.cssSelector(".item:nth-child(128) .item-text")).click();
         */

        /*Browser.driver.findElement(By.cssSelector(".header_nav_primary")).click();
        Browser.driver.findElement(By.linkText("View all paths >")).click();*/

        //Browser.driver.findElement(By.linkText("Java")).click();

        Browser.driver.findElements(By.xpath("//*[@id=\"pathContent\"]/div[128]/a/div/div[1]/img")).get(0).click();

    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
