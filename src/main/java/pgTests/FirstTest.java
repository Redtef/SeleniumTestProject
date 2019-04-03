/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgTests;

/**
 *
 * @author Boss
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {
        //On declare avec quel navigateur et donc quel webdriver on va choisir
        
       //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boss\\chromeDriver\\chromedriver.exe");
        
        //On instancie le driver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        
        String baseUrl = "http://127.0.0.1:8000/";
        String actualTitle = "";

        // demarrer chrome et aller vers baseUrl
        driver.get(baseUrl);

        // On prend le titre actuel du site
        actualTitle = driver.getTitle();

        System.out.println("Le titre de la page" +actualTitle);
        
        Thread.sleep(30);
        //driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(5));
        //close Fire fox
        driver.close();

    }

}
