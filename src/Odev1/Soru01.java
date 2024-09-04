package Odev1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru01 extends BaseDriver {

    /*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

    */

    @Test
    public void Test(){

        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullname= driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement adress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        adress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement peradress = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper'] textarea[rows='5']"));
        peradress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submit = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        submit.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(fullname.getAttribute("value").contains("Automation"));
        Assert.assertTrue(email.getAttribute("value").contains("Testing"));

        BekleKapat();


    }
}
