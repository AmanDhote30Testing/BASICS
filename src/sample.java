import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class sample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Execute test cases
        testValidLogin(driver);
        testInvalidLogin(driver);
        testEmptyCredentials(driver);

        // Close the browser
        driver.quit();
    }

    // Test Case 1: Valid Login
    public static void testValidLogin(WebDriver driver) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        performLogin(driver, "Admin", "admin123");

        if (isElementPresent(driver, By.xpath("//h6[text()='Dashboard']"))) {
            System.out.println("Test Case 1 Passed: Valid Login");
        } else {
            System.out.println("Test Case 1 Failed: Valid Login");
        }
    }

    // Test Case 2: Invalid Login
    public static void testInvalidLogin(WebDriver driver) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        performLogin(driver, "InvalidUser ", "InvalidPass");

        if (isElementPresent(driver, By.xpath("//div[@role='alert']"))) {
            System.out.println("Test Case 2 Passed: Invalid Login");
        } else {
            System.out.println("Test Case 2 Failed: Invalid Login");
        }
    }

    // Test Case 3: Empty Credentials
    public static void testEmptyCredentials(WebDriver driver) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        List<WebElement> errorMessages = driver.findElements(By.xpath("//span[text()='Required']"));
        if (errorMessages.size() == 2) {
            System.out.println("Test Case 3 Passed: Empty Credentials");
        } else {
            System.out.println("Test Case 3 Failed: Empty Credentials");
        }
    }

    // Helper method to perform login
    private static void performLogin(WebDriver driver, String username, String password) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    // Helper method to check if an element is present
    private static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}