package SeleniumCodes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

    /* Explict Wait: Declare then use
     * Advantages:
     *      1. Conditonal based, it will work more effectively.
     *      2. Finding element is inclusive(for some condtions),
     *      3. It will wait for condition to be true, then consider the time.
     *      4. We need to write multiple statements for multiple elements.
     * Disadvantages: 
     *      1. If the time is not sufficient then you will get an exception. 
     */

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));  // Declaration  
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    

    WebElement signin=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='gb_Ua gb_yd gb_pd gb_gd']")));
    signin.click();
    WebElement createAccount=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='n3Clv']")));
    createAccount.click();

    }
    
}
