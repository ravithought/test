import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		{
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAVI RANJAN\\\\Desktop\\\\Test Evidence\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Modify Wait time as per the Network Ability in the Thread Sleep method
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.google.com");
			//System.out.println(driver.findElement(By.id("lblError")).getText());
			//driver.findElement(By.id("txtLoginID")).sendKeys("sbtestrr");
			//driver.findElement(By.name("txtPassword")).sendKeys("Admin@1234");
			//driver.findElement(By.id("ddlLanguage")).sendKeys("English");
			//driver.findElement(By.className("btn-success")).click();
			
			//System.out.println(driver.findElement(By.cssSelector("span.lblError")).getText());
			//driver.findElement(By.linkText("Search & Book")).click();
			
			//driver.findElement(By.id("ctl00$ContentPlaceHolder1$drpFLTo")).sendKeys("Delhi, delhi(DEL)");
			
			//driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDepartureDate']")).click();
			//driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtReturnDate']")).click();
			//Thread.sleep(2000);
		}
		
			
//			Date d = new Date(1);
//			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
//			String date = formatter.format(d);
//			String splitter[] = date.split("-");
//			String month_year = splitter[1];
//			String day = splitter[0]; 
//			System.out.println(month_year);
//			System.out.println(day);
//
//
//			selectDate(month_year,day); 
//			Thread.sleep(3000);
//		}
//			

//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}		public static void selectDate(String month_year, String select_day) throws InterruptedException
//		{ 
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[1]"));
//
//		for (int i=0; i<elements.size();i++)
//		{
//		System.out.println(elements.get(i).getText());
//
//		//Selecting the month
//		if(elements.get(i).getText().equals(month_year))
//		{ 
//
//		//Selecting the date 
//		List<WebElement> days = driver.findElements(By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a"));
//
//		for (WebElement d:days)
//		{ 
//		System.out.println(d.getText());
//		if(d.getText().equals(select_day))
//		{
//		d.click();
//		Thread.sleep(10000);
//		return;
//		}
//		} 
//
//		} 
//
//		}
		
		
		//driver.findElement(By.linkText("RAVI RANJAN")).click();
		//driver.findElement(By.linkText("Logout")).click();
		//driver.close();

	}

}
