package com.apust.java.seleniumGradle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Main {

    private WebDriver driver;
    private WebDriverWait wait;

    private final static String chromedriverPathWin = (System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe")
            .replaceAll("\\\\|/", "\\" + System.getProperty("file.separator"));


    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", chromedriverPathWin);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void check(){
        driver.navigate().to("https://ya.ru");
        driver.findElement(By.xpath("//*[@id='text']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button")).click();
        wait.until(titleIs("Яндекс"));
    }

    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
        driver = null;
    }
}
