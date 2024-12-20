package genericScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage 
{
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	public FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement enterUsn()
	{
		return usn;
	}
	public WebElement enterPwd()
	{
		return pwd;
	}
	public WebElement clickLogin()
	{
		return loginButton;
	}
	
}
