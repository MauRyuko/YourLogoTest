import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","E:/Mau QA/selenium-java-4.5.0/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
    }
}
