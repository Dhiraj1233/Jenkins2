package Advance;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoITt 
{
	
    WebDriver driver;
	@Test
	public void auto() throws IOException, InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Sw/chromedriver.exe";
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/file.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\dhira\\OneDrive\\Desktop\\Autoit\\Example AuotIt2.exe");
	}

}
