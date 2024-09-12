package Odev3;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru01 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        MyFunc.Bekle(2);

        List<WebElement> cities = driver.findElements(By.xpath("//*[@id='answerDiv']//*[@class='dragDropSmallBox']"));
        List<WebElement> countries = driver.findElements(By.xpath("//*[@id='questionDiv']//*[@class='destinationBox']"));

        Actions actions = new Actions(driver);

        for (WebElement city : cities) {
            for (WebElement country : countries) {

                actions.dragAndDrop(city,country).click().build().perform();

            }

        }BekleKapat();
    }
}
