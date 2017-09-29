import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by User on 29.09.2017.
 */
public class testListDuckStick extends TestBase {

    @Test
    public void testSticker () {
        driver.get("http://localhost/litecart/en/");
       List<WebElement> duckList =  driver.findElements(By.cssSelector("div.box li[class^=pro]"));
        System.out.println(duckList.size());
        for (int i = 1; i <= duckList.size() ; i++) {
            Assert.assertTrue(isElementPresent(By.cssSelector("[class^=stick]")));

        }

    }

}
