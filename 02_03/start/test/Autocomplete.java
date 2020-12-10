import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        //Thread.sleep(8000);
        WebElement addr = driver.findElement(By.id("autocomplete"));
        addr.sendKeys("12340 Boggy Creek Road, Orlando, FL");

        Thread.sleep(1000);
        WebElement autoResult = driver.findElement(By.className("pac-item"));
        autoResult.click();

        //driver.quit();
    }
}
