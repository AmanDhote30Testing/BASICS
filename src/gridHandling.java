import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class gridHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=50000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i =0; i<values.size();i++){
            int j = Integer.parseInt(values.get(i).getText());
            sum = sum+j;
        }
        System.out.println(sum);
        String totalValue = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
        int valueTotal = Integer.parseInt(totalValue);
        Assert.assertEquals(sum, valueTotal);
    }
}
