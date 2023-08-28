import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AssertionsinAutomation

{

public static void main(String[] args) throws InterruptedException

{
	
ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options); driver.get("https://sbtqa.birdres.com/ct/user/login.aspx");

driver.manage().window().maximize();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("txtLoginID")).sendKeys("rrtest");
driver.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
driver.findElement(By.id("ddlLanguage")).sendKeys("English");
driver.findElement(By.className("btn-success")).click();
driver.findElement(By.linkText("Search & Book")).click(); 

/*Assert.assertFalse(driver.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay")).isSelected());

driver.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay")).click();

Assert.assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_rboOneWay']")).isSelected());*/

//driver.findElement(By.cssSelector("div[class='trip-type']")).click();
Thread.sleep(2000L);

/*int i=1;
while (i<9)
{
driver.findElement(By.id("hrefIncAdt")).click();
i++;

}*/

for (int i=1;i<4;i++)
{
	driver.findElement(By.cssSelector("div[class='trip-type']")).click();
}
Assert.assertEquals(driver.findElement(By.cssSelector("div[class='trip-type']")).getText(), "DOMESTIC\r\n"
		+ "INTERNATIONAL");

System.out.println(driver.findElement(By.cssSelector("div[class='trip-type']")).getText());


}
}
