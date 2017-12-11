package com.apust.java.seleniumGradle;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static ThreadLocal<WebDriver> t1Driver = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;

    private final static String chromedriverPathWin = (System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe")
                                                       .replaceAll("\\\\|/", "\\" + System.getProperty("file.separator"));

    private final static String geckodriverPathWin = (System.getProperty("user.dir")  + "\\src\\test\\resources\\geckodriver.exe")
                                                      .replaceAll("\\\\|/", "\\" + System.getProperty("file.separator"));

//       System.setProperty("webdriver.gecko.driver", geckodriverPathWin);


    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", chromedriverPathWin);
        driver = new ChromeDriver();


//        System.setProperty("webdriver.gecko.driver", geckodriverPathWin);
//        driver = new FirefoxDriver();

        wait = new WebDriverWait(driver, 10);



//        Cookie cook = new Cookie("ACCOUNT_CHOOSER", "AFx_qI7NddkmejBc2cEJtQJGVGhbCk6i1H6WCDQjev8vhNQKGux9hO_8ESyH72NzwjCjV6-LsblwlMnb8vnR_ecVawoj4lWdoeuhWZaIonpR4V4dVucq2OtQGHQ0PsHuv8olNDXwnwf5de_OoTWK2PIX8wdXWaorgA", "accounts.google.com/");
//
//        driver.manage().addCookie(cook);
    }



    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
        driver = null;
    }
}
