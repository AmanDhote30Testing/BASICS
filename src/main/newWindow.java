package main;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class newWindow {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> w = driver.getWindowHandles();
        Iterator<String> nw = w.iterator();

        String pW = nw.next();
        String cW = nw.next();

        driver.switchTo().window(cW);
        driver.get("https://rahulshettyacademy.com/");

        String course = driver.findElement(By.xpath("//a[contains(text(),'Core java for Automation Testers + Interview Programs')]")).getText();

        driver.switchTo().window(pW);

        WebElement e = driver.findElement(By.cssSelector("[name='name']"));
        e.sendKeys(course);
        File src = e.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshot1.png"));
        driver.quit();

    }
}
