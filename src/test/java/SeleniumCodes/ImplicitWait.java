package SeleniumCodes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
    public static void main(String[] args) {
        

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    /* Implicit Wait
     * Advantages:
     *      1. Single TIme/One statement
     *      2. It will not wait till maximum time if the element is available.
     *      3. Applicable for all the elemnts.
     * Disadvantages: 
     *      1. If the time is not sufficient then you will get an exception. 
     */

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.get("https://demo.automationtesting.in/Frames.html");
    driver.manage().window().maximize();
    
    }
}
