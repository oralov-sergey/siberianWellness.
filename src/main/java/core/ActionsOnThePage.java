package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionsOnThePage extends SuperClass {

    public static void getBrowser(String URL) {
        driver.get(URL);
    }

    public static void waitElementAndSendKeys(String xpath, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(text);
    }

    public static void waitElementAndClick(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }

    public static void scrollIntoView(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String getText(String xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();

    }

    public static void waitPresenceOfElement(String xpath) {
        WebDriverWait item = new WebDriverWait(driver, 30);
        item.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static Boolean presenceOfElements(String xpath){
        List<WebElement> products = driver.findElements(By.xpath(xpath));
        return products.size() > 0;
    }
}
