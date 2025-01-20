package SeleniumCodes;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

java.util.function.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();    
        WebDriver driver= new ChromeDriver();

        FluentWait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeOut(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))    
                .ignoring(NoSuchElementException.class);

        // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));  // Declaration  
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
        public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//a[@class='gb_Ua gb_yd gb_pd gb_gd']"));
     }
   });
    }
    
}
