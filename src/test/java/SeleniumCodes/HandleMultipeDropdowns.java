package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipeDropdowns{

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.automationtesting.in/Register.html");

    WebElement drpSkillsEle= driver.findElement(By.xpath("//select[@id='Skills']"));
    selectOptionFromDropdown(drpSkillsEle, "Android");
    WebElement drpCountryEle= driver.findElement(By.xpath("//select[@id='country']"));
    selectOptionFromDropdown(drpCountryEle, "India");
    }

    public static void selectOptionFromDropdown(WebElement ele, String value){
        
        Select drp= new Select(ele);
        List<WebElement> alloptions= drp.getOptions();
        for(WebElement option:alloptions){
        if(option.getText().equals(value))
        {
            option.click();
            break;  
        }
    }
    driver.quit();
    }
}
