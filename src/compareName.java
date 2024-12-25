import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class compareName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).click();
        Thread.sleep(1000);
        Actions a =new Actions(driver);
        WebElement e = driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']"));
        a.moveToElement(e).sendKeys("united").build().perform();
        Thread.sleep(2000);
        List<WebElement> names = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
        for(int i=0; i<names.size();i++){
            String v = names.get(i).getText();
            if(v.contains("United Kingdom")){
                for(int j =0;j<=i;j++) {
                    String completedName = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
                    System.out.println("Country name in search box is:" + completedName + "\n");
                    if (completedName.contains("Kingdom")) {
                        a.moveToElement(driver.findElement(By.cssSelector("li[class='ui-menu-item']"))).click().build().perform();
                        completedName = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
                        if (completedName.contains("Kingdom")) {
                            System.out.println("Clicked on the country to be entered:" + completedName + "\n");
                            System.out.println("PASS");
                            driver.quit();
                            break;
                        }
                        break;
                    } else {
                        a.moveToElement(driver.findElement(By.cssSelector("li[class='ui-menu-item']"))).sendKeys(Keys.ARROW_DOWN).build().perform();
                        System.out.println("Pressed down arrow key to move the desired country" + "\n");
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
