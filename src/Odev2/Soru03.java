package Odev2;

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

        WebElement placeholder = driver.findElement(By.xpath("//*[@class='col-xs-20 searchformInput keyword']"));
        placeholder.sendKeys("teddy bear");
        MyFunc.Bekle(1);

        WebElement search= driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        search.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span")).isDisplayed());
        Assert.assertTrue("We've got 63 results for 'teddy bear'", driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span")).getText().contains("We've got 63"));
        System.out.println("Test Passed");

        BekleKapat();

    }
}
