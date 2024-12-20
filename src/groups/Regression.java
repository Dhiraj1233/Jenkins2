package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(groups= {"Performance","Regression","Sanity","Smoke","SystemTesting"})
public class Regression 
{
	@Test
	public void regreTst() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();
		
}

}
