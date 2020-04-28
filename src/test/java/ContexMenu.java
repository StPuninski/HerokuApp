import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContexMenu {
  @Test
    public void contex(){

    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().setSize(new Dimension(1024, 768));

    driver.get("http://the-internet.herokuapp.com/context_menu");
    WebElement element =  driver.findElement(By.id("hot-spot"));
    Actions actions = new Actions(driver);
    actions.contextClick(element).perform();
    }
}
