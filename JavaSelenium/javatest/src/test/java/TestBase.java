import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 29.09.2017.
 */
public class TestBase  {

    public WebDriver driver;
    public WebDriverWait wait;

    public boolean isElementPresent (By locator){
        try {
           driver.findElement(locator);
           return true;
        }catch (Exception e){
            return false;
        }
    }

    @Before
    public void start (){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
        driver = new ChromeDriver(caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(((HasCapabilities) driver).getCapabilities());
//         DesiredCapabilities cap = new DesiredCapabilities();
//         cap.setCapability(FirefoxDriver.MARIONETTE,true);
//      driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Program Files\\Nightly\\firefox.exe")),new FirefoxProfile(),cap);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//          driver = new ChromeDriver(options);
          wait = new WebDriverWait(driver,10);
    }

    @After
    public void stop (){
        driver.quit();
        wait = null;

    }
}
