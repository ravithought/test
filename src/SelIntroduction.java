import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

public static void main(String[] args) {

System.setProperty("webdriver.edge.driver", "C:\\Users\\RAVI RANJAN\\Desktop\\Ravi\\msedgedriver.exe");

WebDriver driver = new EdgeDriver();

driver.get("https://rahulshettyacademy.com");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

driver.close();

//driver.quit();

}

}