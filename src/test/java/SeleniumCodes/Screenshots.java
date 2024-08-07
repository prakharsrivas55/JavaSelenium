package SeleniumCodes;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots{

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");

    //*** Full Page Screenshots ***/
    TakesScreenshot ts=(TakesScreenshot) driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File trg= new File(".\\Screenshots\\amazon_homepage.png"); 
    FileUtils.copyFile(src, trg);

    //*** One Section Screenshots ***/
    WebElement section=driver.findElement(By.xpath("//div[@id='nav-belt']"));
    // TakesScreenshot ts=(TakesScreenshot) driver; Not needed in this because this is already a method
    File sourcFile=section.getScreenshotAs(OutputType.FILE);
    File desFile= new File(".\\Screenshots\\amazon_navbar.png"); 
    FileUtils.copyFile(sourcFile, desFile);

    //*** Logo Screenshots ***/
    WebElement logo=driver.findElement(By.xpath("//div[@id='nav-logo']"));
    // TakesScreenshot ts=(TakesScreenshot) driver; Not needed in this because this is already a method
    File source=logo.getScreenshotAs(OutputType.FILE);
    File destination= new File(".\\Screenshots\\amazon_logo.png"); 
    FileUtils.copyFile(source, destination);
    driver.quit();
    }
}
