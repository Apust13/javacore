package com.apust.java.seleniumGradle;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test2 extends Main {

    @Test
    public void check1(){
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("1 - Selenium Java - 1");
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
        wait.until(titleIs("Яндекс"));
    }

    @Test
    public void check2(){
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("2 - Selenium Java - 2");
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
        wait.until(titleIs("Яндекс"));
    }

    @Test
    public void check3(){
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("3 - Selenium Java - 3");
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
        wait.until(titleIs("Яндекс"));
    }

    @Test
    public void check4(){
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("4 - Selenium Java - 4");
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
        wait.until(titleIs("Яндекс"));
    }
}
