package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {
    public static  void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);

        //to send words with shift keys and press enter
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("watch").keyDown(Keys.ENTER).build().perform();

        //to hower over element
        WebElement signInHower = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        a.moveToElement(signInHower).contextClick().build().perform();
    }
}
