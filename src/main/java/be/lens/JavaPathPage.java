package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage{

    @FindBy(how = How.CSS, using = "#content > div > div.paths-header > div:nth-child(2) > div.columns.large-7.path-header > h1")
    WebElement pageElement;

    @Override
    public void goTo() {
        String elem = "//*[@id=\"pathContent\"]/div[128]/a/div/div[2]";

        WebElement myelement = Browser.driver.findElement(By.xpath(elem));
        JavascriptExecutor jse2 = (JavascriptExecutor) Browser.driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        jse2.executeScript("window.scrollBy(0,-250)");

        Browser.driver.findElement(By.xpath(elem)).click();
    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }
}
