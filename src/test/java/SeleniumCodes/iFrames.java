package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames{

    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://www.google.com/");
    driver.manage().window().maximize();

    List<WebElement> iframes= driver.findElements(By.xpath("//iframe"));
    System.out.println("iframe length is:"+ iframes.size());

    /*
    driver.switchTo().frame(name/id);
    driver.switchTo().frame(WebElement);
    driver.switchTo().frame(index);
    */

    driver.switchTo().frame("callout");
    driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();;
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("test");;

    


    // // driver.quit();
    }
}
