package SeleniumCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile{

    public static void main(String[] args) throws AWTException, InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://demo.automationtesting.in/FileUpload.html");
    // driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Users\\prakharsrivastava\\Desktop\\Dummy.pdf");;

    //**** Using Robot class ****/

    // JavascriptExecutor js= (JavascriptExecutor)driver; //Typecast - Check Hierchy
    // js.executeScript("arguments[0].click();", button);

    WebElement button= driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']"));
    button.click();

    /*
     * 1- Copy the path
     * 2- CTRL +V
     * 3- Enter
     */

    Robot rb= new Robot();
    rb.delay(2000);

    //Put path to the clipboard
    StringSelection ss= new StringSelection("C:\\Users\\prakharsrivastava\\Desktop\\Dummy.pdf");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);  

    //CTRL +V
    rb.keyPress(KeyEvent.VK_CONTROL); // Press on Control Key
    rb.keyPress(KeyEvent.VK_V); // Press on V key

    rb.keyRelease(KeyEvent.VK_CONTROL); // Press on Control Key
    rb.keyRelease(KeyEvent.VK_V); // Press on V key

    // Enter Key
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);



   

    // driver.quit();
    }
}
