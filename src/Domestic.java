import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Domestic

{

public static void main(String[] args) throws InterruptedException

{
	
ChromeOptions options = new ChromeOptions(); 

options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options); 

driver.get("https://sbtqa.birdres.com/ct/user/login.aspx");

driver.manage().window().maximize(); // Maximize page

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

//Thread.sleep;

Thread.sleep(1000);
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); // date select

driver.findElement(By.name("ctl00$ContentPlaceHolder1$imgSearch")).click(); // search 

//Explicit Wait

//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[flname='Vistara']")));

driver.findElement(By.cssSelector("a[flname='Vistara']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Book']")).click();

//driver.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_btnReview'])[1]")).click();
//driver.findElement(By.cssSelector("input[id*='chkAcceptSubmit']")).click();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ImageButton1\"]")).click();

driver.findElement(By.cssSelector("input[id*='chkTermNCondition']")).click();
driver.findElement(By.cssSelector("input.btn.btn-success")).click();

/*driver.findElement(By.cssSelector("div.closeIcon")).click();
driver.findElement(By.linkText("Staging user")).click();
driver.findElement(By.linkText("Logout")).click();
driver.close();*/
}
}
