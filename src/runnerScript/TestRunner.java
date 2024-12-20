package runnerScript;
import org.testng.annotations.Test;
import basePage.HomePage;
import dataprovide.CutomizeDataPro;
public class TestRunner  extends HomePage
{
	@Test(dataProvider = "LoginData" ,dataProviderClass = CutomizeDataPro.class)
	public void runner(String usn,String psw)
	{
		fp.enterUsn().sendKeys(usn);
		fp.enterPwd().sendKeys(psw);
		fp.clickLogin().click();
		driver.close();
		
	}
//	@DataProvider(name="test")
//	public Object[][] createData1() 
//	{
//		return new Object[][]
//				{
//		{"admin","manager"},
//		{"admin1","manager1"},
//		{"admin2","manager2"},
//	};
//	}
	@Test(dependsOnMethods = "runner")
	public void title()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(dependsOnMethods = "title")
	public void checkUsn()
	{
		boolean res = fp.enterUsn().isDisplayed();
		System.out.println(res);
//		Assert.fail();
	}
	@Test(dependsOnMethods = "checkUsn")
	public void checkLgButton()
	{
		boolean res1 = fp.clickLogin().isEnabled();
		System.out.println(res1);
	}
}
