package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//within the class

public class Webforms 
{
	@Test(dataProvider = "LoginData")
	public void qspDemo(String req,String min, String pass, String cnfpass, String email,
			String url,String dig,String num,String alpnum,String max,String range,String minV
			,String maxV, String rangeV )
	{
		System.setProperty("webdriver.chrome.driver", "./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys(req);
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys(min);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys(cnfpass);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url);
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys(dig);
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys(num);
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys(alpnum);		
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys(max);
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys(range);
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys(minV);
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys(maxV);
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys(rangeV);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		driver.close();
	}
	@DataProvider(name = "LoginData")
	public Object[][] getData()
	{
		 Object[][] data= {
				{"Dhiraj","123456","Dhiraj@123","Dhiraj@123",
				"Dhiraj@gmail.com","https://www.fk.com",
				"234567","9229181265","Dhiraj@123","3","3","4","6","4"},
		 };
		 return data;
	}


}
