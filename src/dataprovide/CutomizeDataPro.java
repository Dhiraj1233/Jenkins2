package dataprovide;

import org.testng.annotations.DataProvider;

public class CutomizeDataPro 
{
	//Between the class
	@DataProvider(name = "LoginData")
	public Object[][] getData()
	{
		 Object[][] data= {
				{"Dhiraj@gmail.com","Dhiraj@123"},
				{"Dhiraj123@gmail.com","Dhiraj@1233"},
				{"Dhiraj213@gmail.com","Dhiraj@1238"}};
		 return data;
	}

}
