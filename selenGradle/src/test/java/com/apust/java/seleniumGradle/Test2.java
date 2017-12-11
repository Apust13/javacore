package com.apust.java.seleniumGradle;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test2 extends Main {

    @Test
    public void check(){
        driver.navigate().to("https://google.com");
//        driver.findElement(By.xpath("//*[@id='text']")).sendKeys("Selenium Java");
//        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button")).click();
        wait.until(titleIs("Яндекс"));
    }
}
