package dataprovide;

import org.testng.annotations.Test;

public class DataPro 
{
	//between the class
	@Test(dataProvider = "LoginData" ,dataProviderClass = CutomizeDataPro.class)
	public void loginTestData(String un,String psw)
	{
		System.out.println(un+" "+psw);
	}

}
