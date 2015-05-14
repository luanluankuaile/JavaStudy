package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
//import org.openqa.selenium.internal.*;

import com.thoughtworks.selenium.*;


public class SeleniumStudy{
	@Test 
public void calculatepercent(){
System.setProperty("webdriver.chrome.driver","D:/software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://wwwexpediacom.trunk.sb.karmalab.net");
WebDriverCommandProcessor webProcessor=new WebDriverCommandProcessor("http://wwwexpediacom.trunk.sb.karmalab.net", driver); 
DefaultSelenium selenium=new DefaultSelenium(webProcessor);
//selenium.check("css=a#primary-header-package");
if (selenium.isElementPresent("id=primary-header-package")){
selenium.check("id=primary-header-package");
}
selenium.deleteAllVisibleCookies();
selenium.close();

	}
	  
}
