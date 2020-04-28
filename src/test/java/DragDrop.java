import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragDrop {
    @Test
    public void dragdrop() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.get("http://the-internet.herokuapp.com/drag_and_drop");

        WebElement drag = driver.findElement(By.id("column-a"));
        WebElement drop = driver.findElement(By.id("column-b"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).release().perform();
// drag and drop не дружат с html 5   (Глеб подсказал)
// JS я не совсем понял
         // new Actions(driver).clickAndHold(drag).moveToElement(drop)
         //  .release().perform();

         //new Actions(driver).dragAndDrop(drag, drop).perform();

    }
}
