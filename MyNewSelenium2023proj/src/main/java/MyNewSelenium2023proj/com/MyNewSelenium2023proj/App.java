package MyNewSelenium2023proj.com.MyNewSelenium2023proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello Amar 2024 can we start Automation" );
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16 black 256gb");
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        Thread.sleep(5000);
        
        
        
       // driver.quit();
        
        
    }
}
