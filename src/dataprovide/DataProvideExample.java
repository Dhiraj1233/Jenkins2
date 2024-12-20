 package dataprovide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideExample
{
	//Within the class
	@Test(dataProvider = "testData")
	public void launch(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(un);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
	}
	@DataProvider(name="testData")
	public Object[][] createData1() 
	{
		return new Object[][]
				{
		{"admin","manager"},
		{"admin1","manager1"},
		{"admin2","manager2"},
	};
	}
}
