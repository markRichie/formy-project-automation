import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement r1 = driver.findElement(By.id("radio-button-1"));
        r1.click();

        WebElement r2 = driver.findElement(By.cssSelector("input[value='option2']"));
        r2.click();

        WebElement r3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        r3.click();

        driver.quit();
    }
}
