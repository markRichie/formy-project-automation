import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datapicker = driver.findElement(By.id("datepicker"));
        datapicker.sendKeys("03/03/2021");
        datapicker.sendKeys(Keys.RETURN);

        driver.quit();
    }
}