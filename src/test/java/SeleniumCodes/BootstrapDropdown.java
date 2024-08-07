package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown{

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.hdfcbank.com/");

    driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();;
    List<WebElement> productype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));

        for(WebElement option:productype){
        if(option.getText().equals("FASTag"))
        {
            option.click();
            break;  
        }
    }
    // driver.quit();
    }
}
