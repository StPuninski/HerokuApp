import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Inputs {

    @Test
    public void classwork() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.get("http://the-internet.herokuapp.com/inputs");
//        driver.findElement(By.xpath("//*[@id='content']/div/div/div/input"));
        driver.findElement(By.tagName("input")).sendKeys("1e2");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        driver.get("http://the-internet.herokuapp.com/inputs");
        By.cssSelector("input").findElement(driver).sendKeys("123");
        By.cssSelector("input").findElement(driver).clear();
        driver.findElement(By.cssSelector("input")).sendKeys("555");
    }
}
