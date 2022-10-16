import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:/Mau QA/selenium-java-4.5.0/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
    }
}
