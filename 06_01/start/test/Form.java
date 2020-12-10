import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Richard Yogaratnam/Documents/selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("sam");

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("perera");

        WebElement job = driver.findElement(By.id("job-title"));
        job.sendKeys("engineer");

        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement exp = driver.findElement(By.id("select-menu"));
        exp.click();
        WebElement item = driver.findElement(By.cssSelector("option[value='1']"));
        item.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("08/08/2020");
        date.sendKeys(Keys.RETURN);

        WebElement submit = driver.findElement(By.className(".btn .btn-lg .btn-primary"));
        submit.click();

        driver.quit();
    }
}
