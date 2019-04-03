/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgTests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Boss
 */
public class SecondTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boss\\chromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
        String baseUrl = "http://127.0.0.1:8000/";

        driver.get(baseUrl);
        //click sur login 
        driver.findElement(By.xpath("/html/body/div[3]/div/a[3]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement loginElement = driver.findElement(By.id("id_username"));
        loginElement.sendKeys("boss");

        WebElement passwdElement = driver.findElement(By.cssSelector("#id_password"));
        passwdElement.sendKeys("123");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[3]/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[4]/div/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement questionTitleElement = driver.findElement(By.xpath("//*[@id=\"id_title\"]"));
        questionTitleElement.sendKeys("question");

        Select dropDownCategorie = new Select(driver.findElement(By.name("category")));
        dropDownCategorie.selectByVisibleText("Construction");

//        WebElement contenuQuestionElement = driver.findElement(By.xpath("xpath=/html/body/p"));
//        contenuQuestionElement.sendKeys("contenu");

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String success = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[1]")).getText();
        
        System.out.println(success);
        
        driver.close();
        
    }
}
