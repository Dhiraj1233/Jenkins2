package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(groups= {"Performance","Regression","Sanity","Smoke","SystemTesting"})
public class Smoke 
{
	@Test
	public void smoke() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles" +Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
