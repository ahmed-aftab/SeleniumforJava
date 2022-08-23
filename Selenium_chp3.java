package SelenimforJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_chp3 {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement link1 = driver.findElement(By.linkText("Shifting Content"));
        link1.click();
        WebElement link2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        link2.click();
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println("No of menu Elements: "+links.size());
        driver.quit();

    }
    public static void main(String args[]) {
        Selenium_chp3 test = new Selenium_chp3();
        test.setUp();
    }
}
