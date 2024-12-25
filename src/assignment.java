import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement multipleWindows = driver.findElement(By.xpath("//li/a[contains(text(),'Multiple Windows')]"));
        a.moveToElement(multipleWindows).click().build().perform();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> newPage = driver.getWindowHandles();
        Iterator<String> windowIterator = newPage.iterator();
        String previousWindow = windowIterator.next();
        String newWindow = windowIterator.next();
        driver.switchTo().window(newWindow);
        String newPageTitle = driver.getTitle();
        System.out.println("New page title is: " + newPageTitle);
        driver.switchTo().window(previousWindow);
        String previousPageTitle = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
        System.out.println("Previous page title is: " + previousPageTitle);
        driver.quit();
    }
}
