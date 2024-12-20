package groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(groups= {"Performance","Regression","Sanity","Smoke","SystemTesting"})
public class Performance 
{
	@Test
	public void perforTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String src = driver.getPageSource();
        System.out.println(src);
        Thread.sleep(2000);
        driver.quit();
	}

}
