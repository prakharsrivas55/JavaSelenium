package SeleniumCodes;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleIframe{

    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.automationtesting.in/Frames.html");
    driver.manage().window().maximize();

    driver.findElement(By.xpath("//a[@class='analystic' and contains(text(), 'Iframe with in an Iframe')]")).click();
    
    //** First iframe **/
    WebElement outerframe= driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
    driver.switchTo().frame(outerframe);
    
    //** Second iframe **/    
    WebElement inneriframe1= driver.findElement(By.xpath("//div[@class='iframe-container']"));
    driver.switchTo().frame(inneriframe1);
    // assert.assertEquals(0, 0);

    //** Third iframe **/    
    WebElement inneriframe2= driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
    driver.switchTo().frame(inneriframe2);





    

    // // driver.quit();
    }
}
