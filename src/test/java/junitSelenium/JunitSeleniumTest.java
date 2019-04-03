/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitSelenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Boss
 */
public class JunitSeleniumTest {

    static WebDriver driver;

    @BeforeClass
    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boss\\chromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/");
    }

    @Test
    public void verifyTitle() {
        System.out.println("Verify Title");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("BTP"));
    }

    @Test
    public void verifySomethingElse() {
        

    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

    public JunitSeleniumTest() {

    }

}
