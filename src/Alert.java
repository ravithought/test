import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert

{

	public static void main(String[] args) throws InterruptedException

	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.customerservicepoint.amadeus.com/");

		driver.manage().window().maximize();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("saoct");
		driver.findElement(By.name("password")).sendKeys("B!rd$@GKY987#@");
		driver.findElement(By.id("login")).click();
		/*driver.findElement(By.linkText("Logout")).click();

//handle confirm pop-up

		System.out.println(driver.switchTo().alert().getText());

//handle cancel pop-up
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Logout")).click();
		driver.switchTo().alert().accept();

		driver.close();*/
	}

}