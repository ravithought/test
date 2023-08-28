import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edgebooking

{

public static void main(String[] args) throws InterruptedException

{
	
EdgeOptions options = new EdgeOptions(); 

options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.edge.driver", "C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\Edgedriver\\msedgedriver.exe");

WebDriver driver2 = new EdgeDriver(options); 

driver2.get("https://sbtqa.birdres.com/ct/user/login.aspx");

driver2.manage().window().maximize(); // Maximize page

//implicit wait
driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver2.findElement(By.id("txtLoginID")).sendKeys("rrtest");
driver2.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
driver2.findElement(By.id("ddlLanguage")).sendKeys("English");
driver2.findElement(By.className("btn-success")).click();
driver2.findElement(By.linkText("Search & Book")).click(); 

driver2.findElement(By.cssSelector("input#ctl00_ContentPlaceHolder1_rboDOM")).click();
driver2.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay")).click();
driver2.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLFrom")).sendKeys("Delhi");
Thread.sleep(1000);
driver2.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLTo")).sendKeys("Bangalore");

//Thread.sleep;

Thread.sleep(1000);
driver2.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); // date select

driver2.findElement(By.name("ctl00$ContentPlaceHolder1$imgSearch")).click(); // search 

//Explicit Wait

//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[flname='Vistara']")));

driver2.findElement(By.cssSelector("a[flname='Vistara']")).click();
driver2.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver2.findElement(By.xpath("//button[normalize-space()='Book']")).click();

//driver2.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_btnReview'])[1]")).click();
//driver2.findElement(By.cssSelector("input[id*='chkAcceptSubmit']")).click();
driver2.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ImageButton1\"]")).click();

driver2.findElement(By.cssSelector("input[id*='chkTermNCondition']")).click();
driver2.findElement(By.cssSelector("input.btn.btn-success")).click();

/*driver2.findElement(By.cssSelector("div.closeIcon")).click();
driver2.findElement(By.linkText("Staging user")).click();
driver2.findElement(By.linkText("Logout")).click();
driver2.close();*/
}
}
