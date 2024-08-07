package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropdwon{

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

    driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
    selectChoicValue(driver,"choice 1", "choice 2 3","choice 6 2 1");

    }

    public static void selectChoicValue(WebDriver driver, String... value){
    
    List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
    if(!value[0].equalsIgnoreCase("all")){

        for(WebElement item:choiceList )
        {
            String text=item.getText();
            for(String val:value)
            {
                if(text.equals(val))
                {    
                    item.click();
                }
            }
        }
    }
    else{
        for(WebElement item:choiceList)
        {
            item.click();
        }
          
    driver.quit();
    }
}
}


