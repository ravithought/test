import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectAirline

{

public static void main(String[] args) throws InterruptedException

{
	
ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options); driver.get("https://sbtqa.birdres.com/ct/user/login.aspx");

driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("txtLoginID")).sendKeys("rrtest");
driver.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
driver.findElement(By.id("ddlLanguage")).sendKeys("English");
driver.findElement(By.className("btn-success")).click();
driver.findElement(By.linkText("Search & Book")).click(); 
driver.findElement(By.cssSelector("input#ctl00_ContentPlaceHolder1_rboDOM")).click();
driver.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay")).click();
driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLFrom")).sendKeys("Delhi");
Thread.sleep(1000);
driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLTo")).sendKeys("Bangalore");
Thread.sleep(1000);
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
driver.findElement(By.name("ctl00$ContentPlaceHolder1$imgSearch")).click();
driver.findElement(By.cssSelector("a[flname='Vistara']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

driver.findElement(By.xpath("//button[normalize-space()='Book']")).click();


}

}
