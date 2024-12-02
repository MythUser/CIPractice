package mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;

    @Test
    public void testStoreName() {


        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");

        String websiteName = driver.findElement(By.xpath("//h1/a[@href='https://askomdch.com/']")).getText();

        Assert.assertEquals(websiteName, "AskOmDch");

         driver.quit();
    }
    // Checking CI again

}
