package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
 WebDriver driver;

  @Test
  public void open() {
	  
	  driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  driver = new ChromeDriver(options);  
  }

  @AfterTest
	public void afterTest() {
		driver.quit();			
	}	

}
