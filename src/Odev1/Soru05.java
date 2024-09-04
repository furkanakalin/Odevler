package Odev1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru05 extends BaseDriver {
    /*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
    */

    @Test
    public void Test(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakealert= driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakealert.click();
        MyFunc.Bekle(1);

        WebElement showalertbox = driver.findElement(By.cssSelector("[value='Show fake alert box']"));
        showalertbox.click();
        MyFunc.Bekle(1);

        WebElement ok = driver.findElement(By.cssSelector("[class='dialog-button']"));
        ok.click();

        BekleKapat();

    }
}
