import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown

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
driver.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_rboDOM'])[1]")).click();
driver.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_rboOneWay'])[1]")).click();

WebElement staticdropdown = driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLFrom"));

Select dropdown = new Select(staticdropdown);
dropdown.selectByIndex(4);
System.out.println(dropdown.getFirstSelectedOption().getText());

//dropdown.selectByValue("DEL-Delhi");
//System.out.println(dropdown.getFirstSelectedOption().getText());

//dropdown.selectByVisibleText("Kolkata");
//System.out.println(dropdown.getFirstSelectedOption().getText());


WebElement staticdropdown1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLTo"));

Select dropdown1 = new Select(staticdropdown1);
dropdown1.selectByIndex(3);
System.out.println(dropdown1.getFirstSelectedOption().getText());


WebElement staticdropdown2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpCabin"));

Select dropdown2 = new Select(staticdropdown2);
dropdown2.selectByValue("Business");
System.out.println(dropdown2.getFirstSelectedOption().getText());


driver.findElement(By.linkText("Staging user")).click();
driver.findElement(By.linkText("Logout")).click();
driver.close();

}
}
