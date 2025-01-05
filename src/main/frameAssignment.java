package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Actions a = new Actions(driver);
        WebElement nestedFrames = driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]"));
        a.moveToElement(nestedFrames).click().build().perform();
        WebElement firstFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(firstFrame);
        WebElement secondFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(secondFrame);
        WebElement text = driver.findElement(By.cssSelector("div[id='content']"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
