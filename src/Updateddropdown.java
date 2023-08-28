import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options); driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		/*int i=1;
		while (i<9)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		
		}*/
		
		for (int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		

	}

}
