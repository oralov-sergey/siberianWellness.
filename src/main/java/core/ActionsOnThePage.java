package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public static String getText(String xpath){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();

    }

    public static void checkNumber(String expectedNumber){
        Integer number = Integer.valueOf(expectedNumber);
        if (number > 0) {
            System.out.println("Product basket is not empty.");
        } else {
            System.out.println("Error. PRODUCT BASKET IS EMPTY!");
        }
    }

    public static void waitPresenceOfElement(String xpath){
        WebDriverWait item = new WebDriverWait(driver, 30);
        item.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

}
