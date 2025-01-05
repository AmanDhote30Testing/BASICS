package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(frame);
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement root = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,root).build().perform();

        //to switch out of frame
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
