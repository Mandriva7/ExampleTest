package example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void exampleTest() {
        System.setProperty("webdriver.chrome.driver","src/test/java/example/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Software Test Design");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     driver.findElement(By.cssSelector("div[data-component-id='1']")).click();
    /*   Assert.assertEquals(driver.findElement(By.cssSelector("span[id='productTitle']")),"A Practitioner's Guide to
                Software Test Design");
                Assert.assertTrue(driver.findElement(By.cssSelector("#mediaTab_heading_2 > a > span > div:nth-child(1) >
                        span")).isDisplayed(),"Paperback tab was not shown pre-selected ");
                        driver.close(); */
    }

}
