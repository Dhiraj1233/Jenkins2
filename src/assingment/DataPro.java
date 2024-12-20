package assingment;

import org.testng.annotations.DataProvider;

public class DataPro 

{
	@DataProvider(name = "LoginData")
	public Object[][] getData()
	{
		 Object[][] data= {
				{"Dhiraj","123456","Dhiraj@123","Dhiraj@123",
				"Dhiraj@gmail.com","https://www.fk.com",
				"234567","9229181265","Dhiraj@123","3","3","4","6","4"},
				
				{"Dhiraj","123456","Dhiraj@123","Dhiraj@123",
					"Dhiraj@gmail.com","https://www.fk.com",
					"234567","9229181265","Dhiraj@123","4","5","6","7","5"}
		 };
		 return data;
	}
}
