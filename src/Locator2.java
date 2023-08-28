import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
       
public class Locator2 {

       public static void main(String[] args) {

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

              
              System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
              driver.get("https://sbtqa.birdres.com/ct/user/login.aspx");
              driver.findElement(By.id("txtLoginID")).sendKeys("sbtestrr");
              driver.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
              driver.findElement(By.id("ddlLanguage")).sendKeys("English");
              driver.findElement(By.className("btn-success")).click();
              driver.findElement(By.linkText("Search & Book")).click();
              driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtINTTo")).sendKeys("Singapore, Singapore(SIN)");
              //driver.findElement(By.linkText("DepartureDate")).click();
              //driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDepartureDate")).sendKeys("04Oct2023");
              
              driver.findElement(By.linkText("RAVI RANJAN")).click();
              driver.findElement(By.linkText("Logout")).click();
              //driver.close();

       }

}

