package Maven.MavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void testcase1()
	{
		///img[@itemprop='logo']
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practice\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
	
	}
	
	
	@Test
	public void testcase2()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practice\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
	}
	
	
}
