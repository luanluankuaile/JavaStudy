package TestNG;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class ExpediaPackage {
public WebDriver driver=null;
@BeforeMethod
public void prepare(){
	
	System.setProperty("webdriver.chrome.driver","D:/software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://www.expedia.com");
}

@Test
public void testPackage(){
	driver.findElement(By.xpath(".//a[@id='tab-package-tab']")).click();
	driver.findElement(By.xpath(".//input[@id='package-origin']")).sendKeys("SEA");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	if (driver.findElement(By.xpath(".//div[@class='typeahead']")).isDisplayed()){
		driver.findElement(By.xpath(".//a[@id='aria-option-0']")).click();
	}
	driver.findElement(By.xpath(".//input[@id='package-destination']")).sendKeys("EWR");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	if (driver.findElement(By.xpath(".//div[@class='typeahead']")).isDisplayed()){
		driver.findElement(By.xpath(".//a[@id='aria-option-0']")).click();		
	}
	driver.findElement(By.xpath(".//input[@id='package-departing']")).clear();
	driver.findElement(By.xpath(".//input[@id='package-departing']")).sendKeys("10/17/2015");
	driver.findElement(By.xpath(".//input[@id='package-returning']")).sendKeys("10/20/2015");
	driver.findElement(By.xpath(".//button[@type='submit']")).click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}	
	
}
