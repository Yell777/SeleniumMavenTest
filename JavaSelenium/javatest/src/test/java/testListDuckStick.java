import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by User on 29.09.2017.
 */
public class testListDuckStick extends TestBase {

    @Test
    public void testSticker () {
        driver.get("http://localhost/litecart/en/");
       List<WebElement> duckList =  driver.findElements(By.cssSelector("div.box li[class^=pro]"));
        for (int i = 0; i < duckList.size() ; i++) {
            try {
                duckList.get(i).findElement(By.cssSelector(" div[class^=sticker] "));
            }catch (NoSuchElementException ex){
                System.out.println("Эелемент не найден ");
            }
//            Assert.assertTrue(isElementPresent(By.cssSelector("[class^=stick]")));

        }

    }

}
