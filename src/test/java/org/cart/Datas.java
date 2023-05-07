package org.cart;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.utility.BaseClass;

public class Datas extends BaseClass{
	
	
	
	@DataProvider(name = "sampleData")
	private Object[][] Provider() throws IOException {


		return new Object [] []  {
			
			{excelReadDateNumericalDatas("Credentials 1", 1, 0),excelReadDateNumericalDatas("Credentials 1", 1, 1),excelReadDateNumericalDatas("Credentials 1", 1, 0)},
			{excelReadDateNumericalDatas("Credentials 1", 2, 0),excelReadDateNumericalDatas("Credentials 1", 2, 1),excelReadDateNumericalDatas("Credentials 1", 1, 0)}
			
			
		};
		
	}

}
