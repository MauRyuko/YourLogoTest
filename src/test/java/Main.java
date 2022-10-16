import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    public static void main(String[] args){
        //NAVEGA EN CHROME
        System.setProperty("webdriver.chrome.driver","E:/Mau QA/selenium-java-4.5.0/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
        //NAVEGA EL EDGE
        System.setProperty("webdriver.edge.driver","E://Mau QA//selenium-java-4.5.0//msedgedriver.exe");
        WebDriver driver1= new EdgeDriver();
         driver1.get("https://www.google.com");
        driver1.close();

    }
}
