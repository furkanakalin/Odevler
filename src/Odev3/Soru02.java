package Odev3;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru02 extends BaseDriver {

    @Test
    public void Test(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        MyFunc.Bekle(2);

    }
}
