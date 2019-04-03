/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgTests;

import com.mycompany.firstseleniumtest.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Boss
 */
 public class FirstTestHeadless {
        public static void main(String[] args) throws IOException{

            System.setProperty("webdriver.chrome.driver","C:\\Users\\Boss\\chromeDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            WebDriver driver = new ChromeDriver(options);
            driver.get("http://127.0.0.1:8000/");
            File scr2File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            driver.get("http://127.0.0.1:8000/qa/blog/");
            System.out.println("title is: " + driver.getTitle());
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, 
                    new File("C:\\Users\\Boss\\Documents\\NetBeansProjects\\FirstSeleniumTest\\src\\main\\java\\pgTests\\HeadlessChrome.png"));
            FileUtils.copyFile(scr2File,
                    new File("C:\\Users\\Boss\\Documents\\NetBeansProjects\\FirstSeleniumTest\\src\\main\\java\\pgTests\\HeadlessChrome2.png"));
            driver.quit();
        }
        }
