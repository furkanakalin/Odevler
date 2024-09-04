package Odev1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru06 extends BaseDriver {
/*
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
 */
    @Test
    public void Test() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();

        WebElement fakealert = driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakealert.click();
        MyFunc.Bekle(1);

        WebElement showmodeldialog = driver.findElement(By.cssSelector("[value='Show modal dialog']"));
        showmodeldialog.click();
        MyFunc.Bekle(1);

        WebElement ok = driver.findElement(By.cssSelector("[class='dialog-button']"));
        ok.click();

        BekleKapat();


    }
}
