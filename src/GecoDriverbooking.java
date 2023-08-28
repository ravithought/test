import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class GecoDriverbooking

{

public static void main(String[] args) throws InterruptedException

{
	
FirefoxOptions options = new FirefoxOptions(); 

options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\Gecodriver\\geckodriver.exe");

WebDriver driver1 = new FirefoxDriver();

driver1.get("https://sbtqa.birdres.com/ct/user/login.aspx");

driver1.manage().window().maximize(); // Maximize page

//implicit wait
driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver1.findElement(By.id("txtLoginID")).sendKeys("rrtest");
driver1.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
driver1.findElement(By.id("ddlLanguage")).sendKeys("English");
driver1.findElement(By.className("btn-success")).click();
Thread.sleep(1000);
driver1.findElement(By.linkText("Search & Book")).click();
Thread.sleep(1000);
driver1.findElement(By.cssSelector("input#ctl00_ContentPlaceHolder1_rboDOM")).click();
Thread.sleep(1000);
driver1.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay")).click();
Thread.sleep(1000);
driver1.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLFrom")).sendKeys("Delhi");
Thread.sleep(1000);
driver1.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLTo")).sendKeys("Bangalore");

//Thread.sleep;

Thread.sleep(1000);
driver1.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); // date select
Thread.sleep(1000);
driver1.findElement(By.name("ctl00$ContentPlaceHolder1$imgSearch")).click(); // search 

//Explicit Wait

//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[flname='Vistara']")));
Thread.sleep(4000);
driver1.findElement(By.cssSelector("a[flname='Vistara']")).click();
Thread.sleep(4000);
driver1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Thread.sleep(4000);
driver1.findElement(By.xpath("//button[normalize-space()='Book']")).click();
Thread.sleep(4000);

driver1.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_btnReview'])[1]")).click();
Thread.sleep(4000);
driver1.findElement(By.cssSelector("input[id*='chkAcceptSubmit']")).click();
Thread.sleep(4000);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ImageButton1\"]")).click();
Thread.sleep(4000);

driver1.findElement(By.cssSelector("input[id*='chkTermNCondition']")).click();
Thread.sleep(4000);
driver1.findElement(By.cssSelector("input.btn.btn-success")).click();
Thread.sleep(4000);

/*driver2.findElement(By.cssSelector("div.closeIcon")).click();
driver2.findElement(By.linkText("Staging user")).click();
driver2.findElement(By.linkText("Logout")).click();
driver2.close();*/
}
}
