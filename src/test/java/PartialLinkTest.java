import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PartialLinkTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com");
        WebElement user=driver.findElement(By.partialLinkText("Radio"));
        user.click();

        String expectUrl="https://practice.expandtesting.com/radio-buttons";
        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.urlToBe(expectUrl));

        String currentUrl=driver.getCurrentUrl();
        if (currentUrl.equals(expectUrl)){
            System.out.println("Navigated to Radio Practice Page.");
        }
        driver.quit();

    }
}
