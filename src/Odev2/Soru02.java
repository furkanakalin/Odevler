package Odev2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru02 extends BaseDriver {

    /*

1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

    */

    @Test
    public void Test(){

        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement username= driver.findElement(By.xpath("//*[@placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(1);

        WebElement signin = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        signin.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(driver.findElement(By.xpath("//*[@style='text-align: center;font-size: x-large;color:red']")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath("//*[@style='text-align: center;font-size: x-large;color:red']")).getText(), "Your nearest branch closes in: 30m 5s");

        BekleKapat();


    }
}
