package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headlesss 
{
	String key="webdriver.chrome.driver";
	String value="./Sw/chromedriver.exe";
   public  WebDriver driver;
	@Test
	public void head()
	{
		System.setProperty(key,value);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.name("login")).click();
		driver.quit();

	}
	@Test
	public void incognito()
	{
		System.setProperty(key,value);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
