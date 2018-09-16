package DiscoDancer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Mithun {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/shams/IdeaProjects/LateNightShow/Driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.youtube.com/");
        driver.findElement(By.name("search_query")).sendKeys("bd cricket", Keys.ENTER);



    }
}
