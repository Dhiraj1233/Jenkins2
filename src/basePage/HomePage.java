package basePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericScript.FirstPage;

public class HomePage
{
	public FirstPage fp;
	public WebDriver driver;
	@BeforeMethod
	public void lauchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		fp =new FirstPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
