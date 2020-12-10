import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        WebElement menuItem = driver.findElement(By.id("autocomplete"));
        menuItem.click();

        driver.quit();
    }
}
