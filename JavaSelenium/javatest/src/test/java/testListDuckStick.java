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
<<<<<<< HEAD
        for (int i = 0; i < duckList.size() ; i++) {
<<<<<<< HEAD
            try {
                duckList.get(i).findElement(By.cssSelector(" div[class^=sticker] "));
            }catch (Exception ex){
                System.out.println("Эелемент не найден ");
            }
//            Assert.assertTrue(isElementPresent(By.cssSelector("[class^=stick]")));

=======
        System.out.println(duckList.size());
        for (int i = 1; i <= duckList.size() ; i++) {
            
            Assert.assertTrue(isElementPresent(By.cssSelector("[class^=stick]")));
>>>>>>> parent of 77ceb6c... упс
=======
            duckList.get(i).findElement(By.cssSelector("[class^=stick]"));
            Assert.assertTrue(isElementPresent(By.cssSelector("[class^=stick]")));
>>>>>>> parent of 81fcb1a... правка плохого коммита

        }

    }

}
