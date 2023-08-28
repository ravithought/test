import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Corejavabrushup {
	
	
public static void main(String[] args) {

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\RAVI RANJAN\\\\Desktop\\\\Test Evidence\\\\chromedriver_win32\\\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options); //driver.get("https://online-corporate-traveller.amadeus.com/SA/User/su_Login.aspx");
driver.get("https://sbtqa.birdres.com/ct/user/login.aspx");
driver.findElement(By.id("txtLoginID")).sendKeys("shiv001");
driver.findElement(By.name("txtPassword")).sendKeys("Admin@123");
driver.findElement(By.id("ddlLanguage")).sendKeys("English");
driver.findElement(By.className("btn-success")).click();

driver.findElement(By.linkText("Search & Book")).click();

driver.findElement(By.cssSelector("div[data-type='oneway-btn']")).click();

//driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpFLFrom")).sendKeys("DEL-Delhi");

driver.findElement(By.name("ctl00$ContentPlaceHolder1$drpFLTo")).sendKeys("BOM-Mumbai");

driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDepartureDate']")).click();

driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-hover")).click();

driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgSearch")).click();

driver.findElement(By.id("btnFLSelect07")).click();
driver.findElement(By.cssSelector("button[fdprocessedid='zssss']")).click();





//driver.findElement(By.linkText("Shiv Test")).click();
//driver.findElement(By.linkText("Logout")).click();
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

//driver.close();

//driver.quit();



}
}

