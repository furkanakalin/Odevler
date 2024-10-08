package Odev3;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru02 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions actions = new Actions(driver);
        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']//li"));
        List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//div"));


        for (WebElement student : students) {
            for (WebElement kutu : boxes) {
                actions.clickAndHold(student).build().perform();
                MyFunc.Bekle(1);
                actions.moveToElement(kutu).build().perform();
                MyFunc.Bekle(1);
                actions.release().build().perform();


            }
        }
        BekleKapat();
    }
}