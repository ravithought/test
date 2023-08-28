import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

		public class NewFlightOneWay {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				EdgeOptions options = new EdgeOptions(); 

				options.addArguments("--remote-allow-origins=*");

				System.setProperty("webdriver.edge.driver", "C:\\Users\\RAVI RANJAN\\Desktop\\Test Evidence\\Edgedriver\\msedgedriver.exe");

				WebDriver driver = new EdgeDriver(options); 
				
				driver.get("http://www.spicejet.com/");

			    driver.manage().window().maximize();

			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();

			    //Select origin
			    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("DEL");

			    driver.findElement(By.linkText("Delhi (DEL)")).click();

			    //Select destination
			    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("BOM");

			    driver.findElement(By.linkText("Mumbai (BOM)")).click();

			    WebElement DateWidget = driver.findElement(By.id("ui-datepicker-div"));
			    List<WebElement> columns = DateWidget.findElements(By.tagName("td"));

			    for (WebElement cell: columns)
			    {
			        if (cell.getText().equals("24"))
			        {
			            cell.findElement(By.linkText("24")).click();
			            break;
			        }
			    }

			    Select AdultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));

			    AdultDropdown.selectByValue("2");


			    Select ChildrenDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));

			    ChildrenDropdown.selectByValue("1");


			    Select InfantDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));

			    InfantDropdown.selectByValue("1");


			    Select CurrencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

			    CurrencyDropdown.selectByValue("INR");


			    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

			}
			

	}


