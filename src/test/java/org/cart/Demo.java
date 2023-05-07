package org.cart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Cart_Pojo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Demo extends BaseClass {

	Cart_Pojo p;

	@Test(enabled = true)
	public void w3School() {

		launchTheChromeBrowser();
		impliCitWait(10);
		loadURL("https://www.makemytrip.com/");
		WebElement srh = driver.findElement(By.xpath("//a[text()='Search']"));
		srh.click();
		List<WebElement> list = driver.findElements(By.xpath("//p[text()='IndiGo']//following-sibling::p"));
		for (WebElement flitnum : list) {
			
			String text = flitnum.getText();
			System.out.println(text);
			
		}
		
		
		
		
		close_the_Browser();
	}

	@Test(enabled = false)
	public void cart_TestCase_9() {

		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		close_the_Browser();

	}

	

	@Test(enabled = false)
	public void cart_TestCase_5() {

		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		Assert.assertTrue(false);
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		close_the_Browser();

	}

	
//	@Test
//	private void testCase34() {
//		System.out.println("testCase 34 pased");
//		Assert.assertEquals(true, true);
//
//	}
//	
//	
//	@Test//(retryAnalyzer=RetryListener.class)
//	private void testCase33() {
//		Assert.assertEquals(true, false);
//		System.out.println("testCase 33 pased");
//	
//
//	}
//	
//	
//	
//	@Test
//	private void testCase4() {
//		System.out.println("testCase 4 pased");
//		Assert.assertEquals(true, true);
//
//	}
//	
//	
//	@Test
//	private void testCase3() {
//		Assert.assertEquals(true, false);
//		System.out.println("testCase 3 pased");
//		
//
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
