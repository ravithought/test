import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize(); // Maximize page

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("(//div[contains(text(),'From')])[1]")).click(); // from
		
		driver.findElement(By.xpath("(//div[contains(text(),'BLR')])[1]")).click(); // enter from city name

		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click(); // Enter to city name

		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click(); // date click

		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]"))
				.click(); // enter search flight button
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]"))
				.click(); // selected searched flight

	}

}

/*
 * string is an object that represents the sequence of char. How many ways you
 * can define string? String can be defined in two ways:- 
 * 
 * 1. String Literal
 * 
 * String s = "Ravi Ranjan"; 
 * String S1 = "Sonu singh"
 * 
 * 2. New memory locate operator
 * 
 * String s = new String("Ravi Ranjan"); 
 * String S1 = new String("Sonu Singh");
 */
