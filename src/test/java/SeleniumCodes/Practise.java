package SeleniumCodes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.de.Wenn;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

        public static void main(String[] args) {
            
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("null")))l
            ele.click();

            WebElement dropdown = driver.findElement(By.xpath(""));
            Select drp = new Select(dropdown);

            drp.selectByIndex(0);
            drp.selectByValue("null");
            drp.selectByVisibleText("null");

            WebElement el = driver.findElement(By.xpath("null"));
            Select drpskills = new Select(el);

            List<WebElement> drpp = drpskills.getOptions();
            for(WebElement option:drpp){
                
                if(option.getText().equals("hello")){
                    option.click();
                    break;
                }
            }

            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File des = new File("\\path\\ss.png");
            FileUtils.copyFile(src, des);

            WebElement elem = driver.findElement(By.xpath("null"))
            File srcFile = elem.getScreenshotAs(OutputType.FILE);
            File destination = new File("\\pathname\\tst.png");
            FileUtils.copyFile(srcFile,destination);

            
        }
        
}
