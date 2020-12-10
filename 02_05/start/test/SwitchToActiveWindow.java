import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        String originalHandle = driver.getWindowHandle();

        WebElement tabBtn = driver.findElement(By.id("new-tab-button"));
        tabBtn.click();

        for(String handle1: driver.getWindowHandles()){
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }



        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
