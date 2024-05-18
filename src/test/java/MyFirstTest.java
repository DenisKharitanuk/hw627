import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void googleChromeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        driver.quit();
    }

    @Test
    public void firefoxTest() {
        System.setProperty("webdriver.firefox.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        driver.quit();
    }

    @Test
    public void edgeTest() {
        System.setProperty("webdriver.microsowtEdge.driver", "src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        driver.quit();
    }
}
