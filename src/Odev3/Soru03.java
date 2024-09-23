package Odev3;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru03 extends BaseDriver {

    @Test
    public  void  Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//div"));
        List<WebElement> objects =driver.findElements(By.xpath("//ul[@id='allItems']//li"));

        for (WebElement object : objects) {
            for (WebElement kutu : boxes) {
                actions.clickAndHold(object).build().perform();
                MyFunc.Bekle(1);
                actions.moveToElement(kutu).build().perform();
                MyFunc.Bekle(1);
                actions.release().build().perform();

                if (object.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                    break;
                }
            }
        }
        BekleKapat();
    }
}
