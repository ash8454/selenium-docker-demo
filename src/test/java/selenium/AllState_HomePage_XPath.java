package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.fail;

/**
 * Created by SeleniumGuru.com on 1/7/18.
 */
public class AllState_HomePage_XPath {
    @Test
    public void login_test() throws InterruptedException {
        //Declare the gecko driver path
        System.setProperty("webdriver.gecko.driver", "/Users/tulachanashok/Documents/Udemy-Selenium-Java/udemyseleniumjava/geckodriver");

        //Initialize the selenium webdriver class and create object
        WebDriver driver = new FirefoxDriver();

        //Go to newtours website
        driver.get("https://www.allstate.com");

        //maximize the window
        driver.manage().window().maximize();

        //type testing in username text box
        driver.findElement(By.xpath("//input[@class='keywords'][@name='sp_q']")).sendKeys("auto insurance");

        //Destroy the driver instance and close the browser
        driver.quit();


    }
}