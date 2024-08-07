package SeleniumCodes;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

    // @SuppressWarnings("unused")
    public static void main(String[] args){

    //chrome browser
    // System.setProperty("webdriver.chrome.driver","C:\\Users\\prakharsrivastava\\Downloads\\chromedriver win64\\chromedriver-win64\\chromedriver.exe");
    //Object for chrome webdriver
    // ChromeDriver driver=new ChromeDriver();
    // WebDriver driver= new ChromeDriver();

    //**** WebDriverManager */

    /*WebDriverManager.edgedriver().setup();
    WebDriver driver= new EdgeDriver(); */

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://sspuat.leverageedu.com/");
    String expectedTitle= driver.getTitle();
    String ActualTitle="Leverage Edu | SSP | Student Success Portal";
    assertEquals(expectedTitle,ActualTitle);

    driver.quit();
    }
}
