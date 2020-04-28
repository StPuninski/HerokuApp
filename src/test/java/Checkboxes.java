import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Checkboxes {

    @Test
    public void classwork() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.id("checkboxes"));
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
        Assert.assertFalse(Boolean.parseBoolean("false"), "Unchecked");

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
        Assert.assertTrue(Boolean.parseBoolean("true"),"Checked");

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
        Assert.assertTrue(Boolean.parseBoolean("true"),"Checked");

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
        Assert.assertFalse(Boolean.parseBoolean("false"), "Unchecked");


    }
}
