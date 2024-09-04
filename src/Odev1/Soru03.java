package Odev1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru03 extends BaseDriver {

    /*
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */

    @Test
    public void Test(){

        driver.get("https://www.snapdeal.com/");

        WebElement placeholder = driver.findElement(By.cssSelector("[class='col-xs-20 searchformInput keyword']"));
        placeholder.sendKeys("teddy bear");
        MyFunc.Bekle(1);

        WebElement search= driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        search.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(driver.findElement(By.cssSelector("div[id='searchMessageContainer'] [class='nnn']")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='searchMessageContainer'] [class='nnn']")).getText(),"We've got 297 results for 'teddy bear'");

    }
}
