package groups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(groups= {"Performance","Regression","Sanity","Smoke","SystemTesting"})
public class Sanity 
{
	@Test
	public void sanity() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		for (int i = 0; i < count; i++)
		{
			WebElement ele = links.get(i);
			System.out.println(ele.getAttribute("href"));
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
