import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by User on 22.09.2017.
 */
public class testLoginAdmin {


    private WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void start (){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
        driver = new ChromeDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
//         DesiredCapabilities cap = new DesiredCapabilities();
//         cap.setCapability(FirefoxDriver.MARIONETTE,true);
//      driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Program Files\\Nightly\\firefox.exe")),new FirefoxProfile(),cap);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//          driver = new ChromeDriver(options);
          wait = new WebDriverWait(driver,10);
    }
    @Test
    public void testLogin () throws InterruptedException {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
//        wait.wait(100);

    }
    @After
    public void stop (){
        driver.quit();
        wait = null;

    }

}
