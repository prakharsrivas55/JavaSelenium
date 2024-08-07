package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns{

    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.automationtesting.in/Register.html");

    WebElement drpSkillsEle= driver.findElement(By.xpath("//select[@id='Skills']"));
    Select drpSkills= new Select(drpSkillsEle);
    
    //***With using Select methods ***/ 

    drpSkills.selectByVisibleText("Adobe InDesign");
    // drpSkills.selectByValue("Analytics");
    // drpSkills.selectByIndex(4);  //Android

    //***Without using Select methods ***/

    WebElement drpCountryEle= driver.findElement(By.xpath("//select[@id='country']"));
    Select drpCountry= new Select(drpCountryEle);

    List<WebElement> alloptions= drpCountry.getOptions(); 
    for(WebElement option:alloptions){
        if(option.getText().equals("Denmark"))
        {
            option.click();
            break;  
        }
    }

    // // driver.quit();
    }
}
